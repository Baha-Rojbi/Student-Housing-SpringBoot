package tn.esprit.etudedecas.Services;

import tn.esprit.etudedecas.entities.Etudiant;

import java.util.List;


public interface IEtudiantService {
    public Etudiant addEtudiant(Etudiant e);
    public Etudiant updateEtudian(Etudiant e);
    public List<Etudiant> getAllEtudiant();
    public Etudiant getEtudiantById(long idE);
    public void deleteEtudiant(long idE);
}
