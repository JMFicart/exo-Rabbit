package Gateway.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.util.Map;

@RestController
@RequestMapping("/reserv")
public class ReservationController {

    private final RestTemplate template;

    public ReservationController(RestTemplate template) {
        this.template = template;
    }
    @PostMapping
    public ResponseEntity<?> askForReserv(@RequestBody Map<String, String> request){
        System.out.println(request);
        ResponseEntity<Object> response = template.postForEntity("http://localhost:8081/reserv", request, Object.class);
        return response;
    }

    @GetMapping
    public ResponseEntity<?> getReserv(){
        ResponseEntity<Object> response = template.getForEntity("http://localhost:8081/reserv", Object.class);
        return response;
    }
}
