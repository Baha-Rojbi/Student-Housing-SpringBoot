package tn.esprit.etudedecas.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
public class Reservation implements Serializable {
    @Id
    private String IdReservation ;
    @Temporal(TemporalType.DATE)
    private Date anneeUniversitaire ;
    private boolean estValide ;
    @ManyToMany
    private Set<Etudiant> etudiants;
}
