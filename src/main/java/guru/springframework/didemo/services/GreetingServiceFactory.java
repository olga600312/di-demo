package guru.springframework.didemo.services;

import org.springframework.beans.factory.annotation.Autowired;

public class GreetingServiceFactory {
    private GreetingRepository greetingRepository;

    @Autowired
    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lng) {
        GreetingService service;
        switch (lng) {
            case "en":
                service = new PrimaryGreetingService(greetingRepository);
                break;
            case "ru":
                service = new PrimaryRussianGreetingService(greetingRepository);
                break;
            case "de":
                service = new PrimaryGermanGreetingService(greetingRepository);
                break;
            default:
                service = new PrimaryGreetingService(greetingRepository);
        }
        return service;
    }
}
