package de.baerenspielplatz.beartrackerbackend.controller;

import de.baerenspielplatz.beartrackerbackend.entities.Baby;
import de.baerenspielplatz.beartrackerbackend.repositories.BabyRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BabyController {

    private final BabyRepository babyRepository;

    public BabyController(BabyRepository babyRepository) {
        this.babyRepository = babyRepository;
    }

    @GetMapping("/babies")
    Iterable<Baby> babies() {
        return this.babyRepository.findAll();
    }
}
