package com.carDealership;

import java.util.ArrayList;

public class carDealershipDataBase {
    private ArrayList<Vehicle> listOfVehiclevehicles;

    public carDealershipDataBase() {
        this.listOfVehiclevehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle oneVehicle) {
        this.listOfVehiclevehicles.add(oneVehicle);
    }
}
