package com.carDealership;

public class Bike  extends Vehicle{
    private int anchoDeManubrio;

    public Bike(int anchoDeManubrio, String marca, String modelo, String patente) {
        //los constructores no se heredan y
        //la 1ra sentencia debe ser en el  constructor de la subclasela invocacion a SUPER()
        super(marca, modelo, patente);
        this.anchoDeManubrio = anchoDeManubrio;
        // el consturctor de cualquier clase INVOCA primero al de su super clase (cascada ascendente) ==SUPER()
        // primero invoca al padre y despues a la clase heredada
        // PORQUE: papa tiene su propio constructor, la subclase solo lo recibe y ve que hacer con esos datos
        // y delega a papa
    }

    public void doWheelie() {
        System.out.println("Haciendo la wheelie...");
    }

}
