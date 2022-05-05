package Reserve.presentation;

import Reserve.models.Reservation;
import Reserve.models.forms.ReservForm;
import Reserve.service.ReservationService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reserv")
public class ReservationController {

    private final ReservationService service;

    public ReservationController(ReservationService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addReserv(@RequestBody ReservForm form){
        this.service.create(form.map());
    }

    @GetMapping
    @ResponseStatus(HttpStatus.FOUND)
    public List<Reservation> getReserv() {
        return this.service.getReservFactures();
    }
}
