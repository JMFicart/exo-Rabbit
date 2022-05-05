package Gateway.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
@RequestMapping("/facture")
public class FacturationController {
    private final RestTemplate template;

    public FacturationController(RestTemplate template) {
        this.template = template;
    }

    @PostMapping
    public ResponseEntity<?> askForFacture(@RequestBody Map<String, String> request){
        System.out.println(request);
        ResponseEntity<Object> response = template.postForEntity("http://localhost:8082/facture", request, Object.class);
        return response;
    }

    @GetMapping
    public ResponseEntity<?> getFacture() {
        ResponseEntity<Object> response = template.getForEntity("http://localhost:8082/facture", Object.class);
        return response;
    }
}
