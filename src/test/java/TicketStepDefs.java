import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.bdd.BookingPeriod;
import org.example.bdd.FlightTicket;
import org.example.bdd.Ticket;
import org.example.bdd.TicketConstants;
import org.junit.jupiter.api.Assertions;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class TicketStepDefs {

    private Ticket ticket;

    private BookingPeriod bookingPeriod;

    @Given("^I have a flight ticket booking with booking period$")
    public void iHaveAFlightTicketBookingWithBookingPeriod() {
        ticket = new FlightTicket();
        bookingPeriod = ticket.findBookingPeriod();
        assertEquals(TicketConstants.FLIGHT, ticket.findTicketDomain());
        Assertions.assertNotNull(bookingPeriod);
    }

    @When("^I provide the <bookingDate>$")
    public void iProvideTheBookingDate(LocalDate date) {
        assertNull(date);
    }

    @Then("^Advance booking date should be <advanceBookingDate>$")
    public void advanceBookingDateShouldBeAdvanceBookingDate() {
    }
}
