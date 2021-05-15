package org.example.bdd;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Flight  {

    private int id;

    protected List<Passenger> passengerList = new ArrayList<>();

    public abstract void addPassenger(Passenger passenger);

    public abstract boolean removePassenger(Passenger passenger);

    public int getPassengerCount() {
        return passengerList.size();
    }

}
