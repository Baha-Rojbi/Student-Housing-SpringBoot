package tn.esprit.etudedecas.Services;

import tn.esprit.etudedecas.entities.Universite;

public interface IUniversiteService {
    public Universite findByNomFoyer(String nomFoyer);
}
