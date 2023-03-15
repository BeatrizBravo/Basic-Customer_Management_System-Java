package com.carDealership;

public class Car extends Vehicle{

    private boolean airConditioning;

    //constructor
    public Car(boolean airConditioning, String marca, String modelo, String patente) {
        super(marca, modelo, patente);
        this.airConditioning = airConditioning;
    }

    public void turnOnAirConditioning() {
        if (airConditioning) {
            System.out.println("Encendiendo aire...");
        }
    }
}
