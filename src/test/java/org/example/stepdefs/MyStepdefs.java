package org.example.stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.bdd.BusinessFlight;
import org.example.bdd.EconomyFlight;
import org.example.bdd.Flight;
import org.example.bdd.Passenger;
import org.junit.jupiter.api.Assertions;

public class MyStepdefs {

    private Flight flight;

    private Passenger mike;
    private Passenger john;

    @Given("^there is an economy flight$")
    public void thereIsAnEconomyFlight() {
        flight = new EconomyFlight();
        flight.setId(1);
    }

    @When("^we have a usual passenger$")
    public void weHaveAUsualPassenger() {
        mike = new Passenger("Mike", false);

    }

    @Then("^you can add and remove him from economy flights$")
    public void youCanAddAndRemoveHimFromEconomyFlights() {
        flight.addPassenger(mike);
        Assertions.assertAll(
                "Verify Passenger Details",
                () -> Assertions.assertEquals(1, flight.getId()),
                () -> Assertions.assertEquals(1, flight.getPassengerCount())
        );
    }

    @Given("^there is an business flight$")
    public void thereIsAnBusinessFlight() {
        flight = new BusinessFlight();
        flight.setId(2);
    }

    @When("^we have a VIP passenger$")
    public void weHaveAVIPPassenger() {
        john = new Passenger("john", true);
    }

    @Then("^you can add but cannot remove him from economy flights$")
    public void youCanAddButCannotRemoveHimFromEconomyFlights() {
        flight.addPassenger(john);
        Assertions.assertThrows(IllegalStateException.class, () -> flight.removePassenger(john), "passengers are not allowed to be removed from Business Flight once added");
    }
}
