package Facture.controller;

import Facture.model.Facture;
import Facture.service.FactureService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/facture")
public class FactureController {

    private final FactureService service;

    public FactureController(FactureService service) {
        this.service = service;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.FOUND)
    public List<Facture> getReserv() {
        return this.service.getFactures();
    }
}
