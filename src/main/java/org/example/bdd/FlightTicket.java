package org.example.bdd;

import static org.example.bdd.TicketConstants.FLIGHT;

public class FlightTicket implements Ticket {

    @Override
    public String findTicketDomain() {
        return FLIGHT;
    }

    public BookingPeriod findBookingPeriod() {
        return new BookingPeriod();
    }
}
