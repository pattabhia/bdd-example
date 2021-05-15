package org.example.bdd;

import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;

@Data
@ToString
public class BookingPeriod {
    private LocalDate currentDate;
    private LocalDate advanceDate;
}
