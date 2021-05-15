package org.example.bdd;

import java.util.ArrayList;
import java.util.List;

public class EconomyFlight extends Flight {

    @Override
    public void addPassenger(Passenger passenger) {
        passengerList.add(passenger);
    }

    /**
     * @param passenger - Passenger
     * @return boolean - status
     */
    @Override
    public boolean removePassenger(Passenger passenger) {
        return passengerList.remove(passenger);
    }
}
