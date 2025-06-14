package ntp.store.store.repositories;

import ntp.store.store.entities.Departement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DepartementRepository extends JpaRepository<Departement, UUID> {
    // Pour eviter les doublons sur les departements en BD
    boolean existsDistinctByLibelleDepartement(String libelleDepartement);
}
