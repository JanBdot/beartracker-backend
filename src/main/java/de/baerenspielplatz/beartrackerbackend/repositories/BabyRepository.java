package de.baerenspielplatz.beartrackerbackend.repositories;

import de.baerenspielplatz.beartrackerbackend.entities.Baby;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface BabyRepository extends CrudRepository<Baby, UUID> {
}
