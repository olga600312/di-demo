package guru.springframework.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"ru","default"})
@Primary
public class PrimaryRussianGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Привет - Первичная служба приветствия !!!";
    }
}
