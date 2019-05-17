package com.Theresa;

/**
 * A universal Vehicle ID that all classes can use
 */

public class VehicleID {

    private int vehicleID = (int) (Math.random() * 201);
    //generates a random number for a vehicle ID


    public int getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(int v) {
        vehicleID = v;
    }
    public String toString(){
        return vehicleID + " ";
    }
}
