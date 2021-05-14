import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.bdd.EconomyFlight;
import org.example.bdd.Flight;
import org.example.bdd.Passenger;
import org.junit.jupiter.api.Assertions;

public class MyStepdefs {

    private Flight flight;
    private Passenger mike;

    @Given("^there is an economy flight$")
    public void thereIsAnEconomyFlight() {
        flight = new Flight(1);

    }

    @When("^we have a usual passenger$")
    public void weHaveAUsualPassenger() {
        mike = new Passenger("Mike", false);
    }

    @Then("^you can add and remove him from economy flights$")
    public void youCanAddAndRemoveHimFromEconomyFlights() {
        Assertions.assertAll(
                "Verify Passenger Details",
                () -> Assertions.assertEquals(1, flight.getId()));
    }

    @When("^we have a VIP passenger$")
    public void weHaveAVIPPassenger() {
    }

    @Then("^you can add but cannot remove him from economy flights$")
    public void youCanAddButCannotRemoveHimFromEconomyFlights() {
    }
}
