package Reserve.presentation;

import Reserve.models.forms.ReservForm;
import Reserve.service.ReservationService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reserv")
public class ReservationController {

    private final ReservationService service;

    public ReservationController(ReservationService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void askForReserv(@RequestBody ReservForm form){
        this.service.create(form.map());
    }

}
