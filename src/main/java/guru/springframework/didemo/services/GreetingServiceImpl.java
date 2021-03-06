package guru.springframework.didemo.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_GURUS = "Hello Gurus!!!! I am a simple GreetingServiceImpl";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}
