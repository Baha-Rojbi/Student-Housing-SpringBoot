package tn.esprit.etudedecas.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

//@Table(name="tEtudiant")
@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
public class Etudiant implements Serializable {
    @Id
    ///@column(name="tid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant ;
    private String nomEt;
    private String prenomEt;
    private Long cin;
    private String ecole;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance ;
    @ManyToMany(mappedBy = "etudiants")
    private Set<Reservation> reservations;
}
