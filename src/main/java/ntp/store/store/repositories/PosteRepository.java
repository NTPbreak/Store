package ntp.store.store.repositories;

import ntp.store.store.entities.Poste;
import ntp.store.store.entities.TypePoste;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

@Repository
public interface PosteRepository  extends JpaRepository<Poste, UUID> {
    // Pour eviter les doublons sur les postes en BD
    boolean existsDistinctByLibellePoste(TypePoste libellePoste);
}
