package tn.esprit.etudedecas.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
public class Chambre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChambre;
    private Long numChambre ;
    @Enumerated(EnumType.STRING)
    @JsonFormat
    private TypeChambre TypeC;
    @OneToMany
    private Set<Reservation> reservations;
    @JsonIgnore
    @ManyToOne
    private Bloc bloc;
}
