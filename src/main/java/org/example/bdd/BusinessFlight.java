package org.example.bdd;

public class BusinessFlight extends Flight {

    @Override
    public void addPassenger(Passenger passenger) {
        passengerList.add(passenger);
    }

    @Override
    public boolean removePassenger(Passenger passenger) {
        throw new IllegalStateException("passegers are not allowed to be removed from Business Flight once added");
    }
}
