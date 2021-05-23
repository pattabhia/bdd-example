package org.example.bdd;

import org.example.bdd.exception.ApplicationDateFormatException;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static java.time.temporal.TemporalAdjusters.lastDayOfMonth;

public class DatePeriod {

    public static LocalDate getLastMonthEndDate() throws ApplicationDateFormatException {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
            LocalDate now = LocalDate.now();
            LocalDate inputDate = LocalDate.parse("22-Dec-2021", formatter);
            if (inputDate.isAfter(now)) {
                throw new ApplicationDateFormatException(" Input date should be <= current date");
            }
            inputDate = inputDate.minusMonths(1);
            inputDate = inputDate.with(lastDayOfMonth());
            return inputDate;
        } catch (DateTimeException exception) {
            throw new ApplicationDateFormatException("date should be in yyyy-MM-dd format", exception.getCause());
        }
    }
}
