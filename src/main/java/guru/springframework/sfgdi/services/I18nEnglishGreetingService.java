package guru.springframework.sfgdi.services;

import guru.springframework.sfgdi.repositories.EnglishGreetingRepository;

/**
 * Created by jt on 12/27/19.
 */

public class I18nEnglishGreetingService implements GreetingService {

    private final EnglishGreetingRepository engRepository;;

    public I18nEnglishGreetingService(EnglishGreetingRepository engRepository) {
        this.engRepository = engRepository;
    }

    @Override
    public String sayGreeting() {
        return engRepository.sayGreeting();
    }
}
