package guru.springframework.didemo;

import guru.springframework.didemo.controllers.ConstructorInjectedController;
import guru.springframework.didemo.controllers.MyController;
import guru.springframework.didemo.controllers.PropertyInjectedController;
import guru.springframework.didemo.controllers.SetterInjectedController;
import guru.springframework.didemo.examplebeans.FakeDataSource;
import guru.springframework.didemo.examplebeans.FakeJMSDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"guru.springframework.didemo","guru"})
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
       /* MyController myController = ctx.getBean("myController", MyController.class);
        myController.hello();*/
        FakeDataSource fakeDataSource=ctx.getBean("fakeDataSource", FakeDataSource.class);
        System.out.println("Java home is "+fakeDataSource.getJavaHome()+", "+fakeDataSource.getUser()+" "+fakeDataSource.getPassword());

        FakeJMSDataSource jms= (FakeJMSDataSource) ctx.getBean("fakeJmsDataSource");
        System.out.println(jms.getUser()+", "+jms.getPassword());

        /*System.out.println(ctx.getBean("propertyInjectedController", PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean("constructorInjectedController", ConstructorInjectedController.class).sayHello());
        System.out.println(ctx.getBean("setterInjectedController", SetterInjectedController.class).sayHello());
*/
    }
}
