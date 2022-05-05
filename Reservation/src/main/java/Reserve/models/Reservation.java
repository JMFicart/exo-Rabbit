package Reserve.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Data
@NoArgsConstructor
public class Reservation {

    private LocalDate arrive;
    private LocalDate depart;
    private UUID ref = UUID.randomUUID();
    private Status status = Status.DEMANDE;

    public Reservation(LocalDate arrive, LocalDate depart) {
        this.arrive = arrive;
        this.depart = depart;
    }

    public enum Status {
        DEMANDE,
        FACTURE
    }

}
