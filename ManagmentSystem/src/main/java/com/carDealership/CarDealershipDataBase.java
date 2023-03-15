package com.carDealership;

import java.util.ArrayList;

public class CarDealershipDataBase {
    private ArrayList<Vehicle> listOfVehiclevehicles;

    public CarDealershipDataBase() {
        this.listOfVehiclevehicles = new ArrayList<>();
    }


    public void addVehicle(Vehicle oneVehicle) {
        this.listOfVehiclevehicles.add(oneVehicle);
        //este this ayuda a que no se pueda modificar o vaciar desde fuera de esta misma clase
    }

    public void showDataBase(){
        //nos deja ver porque en vehiculo hemos usado toString
        if(listOfVehiclevehicles.isEmpty()){
            System.out.println("There is not car added in DB");
        }else {
            for (Vehicle a:listOfVehiclevehicles) {
                System.out.println(a);

            }

               }
    }
}
