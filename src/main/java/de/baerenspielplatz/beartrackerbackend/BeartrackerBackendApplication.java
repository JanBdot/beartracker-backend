package de.baerenspielplatz.beartrackerbackend;

import de.baerenspielplatz.beartrackerbackend.entities.Baby;
import de.baerenspielplatz.beartrackerbackend.repositories.BabyRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@SpringBootApplication
public class BeartrackerBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeartrackerBackendApplication.class, args);
    }

    @Bean
    ApplicationRunner applicationRunner(GreetingRepository greetingRepository) {
        return args -> {
            greetingRepository.save(new Greeting("Freda!"));
            greetingRepository.save(new Greeting("Lucia!"));
        };
    }

    @Bean
    ApplicationRunner testRunner(BabyRepository babyRepository) {
        return args -> {
            Baby baby1 = new Baby();
            baby1.setName("testbaby1");
            baby1.setBirthday(new Date());
            babyRepository.save(baby1);
        };
    }
}
// #########################################
// Testing Classes below
// #########################################
@RestController
class HelloController {

    private final GreetingRepository greetingRepository;

    @GetMapping("/")
    String hello() {
        return "Hello Freda and Lu!";
    }

    @GetMapping("/greetings")
    Iterable<Greeting> greetings () {
        return greetingRepository.findAll();
    }

    public HelloController(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }
}

@Entity
class Greeting {

    @Id
    @GeneratedValue
    private UUID id;

    private String message;

    public Greeting() {
    }

    public Greeting(String message) {
        this.message = message;
    }

    public UUID getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }
}

interface GreetingRepository extends CrudRepository<Greeting, UUID>{}
