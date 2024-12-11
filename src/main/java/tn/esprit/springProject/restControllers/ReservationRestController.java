package tn.esprit.springProject.restControllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.springProject.services.IReservationService;

import java.time.LocalDate;

@RestController
@AllArgsConstructor
public class ReservationRestController {

    @Autowired
    private IReservationService iReservationService;
    @GetMapping("getCountByDateDebBetween/{dateD}/{dateF}")
    public Long getCountByDateDebBetween(@PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)LocalDate dateD,
                                         @PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)LocalDate dateF) {

    return iReservationService.getCountByDateDebBetween(dateD,dateF);
    }

}
