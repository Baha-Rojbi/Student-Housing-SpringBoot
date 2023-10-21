package tn.esprit.etudedecas.Services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.etudedecas.Repositories.EtudiantRepositories;
import tn.esprit.etudedecas.entities.Etudiant;

import java.util.List;
@Service
@AllArgsConstructor
public class EtudiantServiceImp implements IEtudiantService{
public EtudiantRepositories etudiantRepositories;
    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return etudiantRepositories.save(e);
    }

    @Override
    public Etudiant updateEtudian(Etudiant e) {
        return etudiantRepositories.save(e);
    }

    @Override
    public List<Etudiant> getAllEtudiant() {
        return etudiantRepositories.findAll();
    }

    @Override
    public Etudiant getEtudiantById(long idE) {
        return etudiantRepositories.findById(idE).orElse(null);
    }

    @Override
    public void deleteEtudiant(long idE) {
        etudiantRepositories.deleteById(idE);
    }
}
