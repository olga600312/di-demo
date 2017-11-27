package guru.springframework.didemo.config;

import guru.springframework.didemo.examplebeans.FakeDataSource;
import guru.springframework.didemo.examplebeans.FakeJMSDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
/*//@PropertySource({"classpath:datasource.properties","classpath:jms.properties"})
@PropertySources( // in the enterprise projects this is a prefer style
        {
                @PropertySource("classpath:datasource.properties"),
                @PropertySource("classpath:jms.properties")
        }
)*/
public class PropertyConfig {
  /*  @Autowired
    private Environment environment;*/

    @Value("${guru.username}")
    private String user;

   @Value("${guru.password}")
    private String password;

    @Value("${guru.url}")
    private String url;

    @Value("${java.home}") // system environment variable JAVA_HOME by name convention it's transformated to the java.home annotation
    private String javaHome;

    ///// JMS properties
    @Value("${guru.jms.username}")
    private String jmsUsername;

    @Value("${guru.jms.password}")
    private String jmsPassword;


    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password/*environment.getProperty("processor.identifier")*/); //password
        fakeDataSource.setUrl(url);
        fakeDataSource.setJavaHome(javaHome);
        return fakeDataSource;
    }

    @Bean
    public FakeJMSDataSource fakeJmsDataSource(){
        FakeJMSDataSource fakeJMSDataSource=new FakeJMSDataSource();
        fakeJMSDataSource.setUser(jmsUsername);
        fakeJMSDataSource.setPassword(jmsPassword);
        return fakeJMSDataSource;
    }

   /* @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }*/

}
