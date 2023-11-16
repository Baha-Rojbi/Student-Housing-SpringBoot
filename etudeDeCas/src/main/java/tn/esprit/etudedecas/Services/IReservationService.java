package tn.esprit.etudedecas.Services;

import tn.esprit.etudedecas.entities.Reservation;

import java.util.List;

public interface IReservationService {
    public Reservation addReservation(Reservation reservation);
    public Reservation updateReservation(Reservation reservation);
    public List<Reservation> getAllReservation();
    public Reservation getReservationById(Long idReservation);
    public void  deleteReservation(Long idReservation);
}
