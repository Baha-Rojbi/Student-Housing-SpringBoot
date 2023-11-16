package tn.esprit.etudedecas.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.etudedecas.Repositories.ReservationRepositories;
import tn.esprit.etudedecas.entities.Reservation;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationServiceImp implements IReservationService{
    public ReservationRepositories reservationRepositories;
    @Override
    public Reservation addReservation(Reservation reservation) {
        return reservationRepositories.save(reservation);
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        return reservationRepositories.save(reservation);
    }

    @Override
    public List<Reservation> getAllReservation() {
        return reservationRepositories.findAll();
    }

    @Override
    public Reservation getReservationById(Long idReservation) {
        return reservationRepositories.findById(idReservation).orElse(null);
    }

    @Override
    public void deleteReservation(Long idReservation) {
        reservationRepositories.deleteById(idReservation);
    }
}
