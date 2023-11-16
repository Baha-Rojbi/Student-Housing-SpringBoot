package tn.esprit.etudedecas.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.etudedecas.Services.IReservationService;
import tn.esprit.etudedecas.entities.Reservation;

import java.util.List;
@RestController
@AllArgsConstructor
public class ReservationRestController {
    public IReservationService iReservationService;
    @PostMapping("/addReservation")
    public Reservation addReservation(Reservation reservation){
        return iReservationService.addReservation(reservation);
    }
    @PostMapping("/updateReservation")
    public Reservation updateReservation(Reservation reservation){
        return iReservationService.updateReservation(reservation);
    }
    @GetMapping("/getAllReservation")
    public List<Reservation> getAllReservation(){
        return iReservationService.getAllReservation();
    }
    @GetMapping("/getReservationById/{idReservation}")
    public Reservation getReservationById(Long idReservation){
        return iReservationService.getReservationById(idReservation);
    }
    @DeleteMapping("/deleteReservation/{idReservation}")
    public void  deleteReservation(Long idReservation){
        iReservationService.deleteReservation(idReservation);
    }
}
