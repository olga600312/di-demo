package guru.springframework.didemo.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_GURUS = "Hello Gurus!!!! I am a simple GreetingServiceImpl";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}
