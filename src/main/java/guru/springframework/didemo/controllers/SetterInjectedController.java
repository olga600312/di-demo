package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    private GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }

    @Autowired
   // @Qualifier("setterGreetingService") //may be on either a method level or property parameter
    public void setGreetingService( @Qualifier("setterGreetingService")GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
