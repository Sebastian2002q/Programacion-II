package co.edu.uniquindio.ejemploFactory.model;

import co.edu.uniquindio.ejemploFactory.services.IVehiculo;

public class Carro implements IVehiculo {
    @Override
    public void conducir() {
        System.out.println("Conduciendo un carro");
    }
}
