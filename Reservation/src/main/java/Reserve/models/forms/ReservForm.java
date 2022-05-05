package Reserve.models.forms;

import Reserve.models.Reservation;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ReservForm {

    private LocalDate arrive;
    private LocalDate depart;

    public Reservation map(){
        return new Reservation(arrive, depart);
    }

}
