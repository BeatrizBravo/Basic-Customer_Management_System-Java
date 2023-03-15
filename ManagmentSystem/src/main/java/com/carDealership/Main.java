package com.carDealership;

public class Main {
    public static void main(String[] args) {
        CarDealershipDataBase easycars = new CarDealershipDataBase();

                             //(int anchoDeManubrio, String marca, String modelo, String patente)
        Bike bike = new Bike(10,"Honda" ,"ht-v","M123");
        Car car = new Car(true, "Peugeot" ,"z1","ABC123");

        easycars.addVehicle(bike);
        easycars.addVehicle(car);
        easycars.showDataBase();

    }
}
