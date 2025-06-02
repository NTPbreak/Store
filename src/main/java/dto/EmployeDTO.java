package dto;


import entities.TypePoste;

import java.util.UUID;

public record EmployeDTO(
        UUID id,
        String nom,
        String email,
        Integer anciennete,
        Integer salaire,
        TypePoste poste,
        String departement
) {
}
