package co.edu.uniquindio.ejemploFactory;

import co.edu.uniquindio.ejemploFactory.services.IVehiculo;

public class MainEjemploFactory {
    public static void main(String[] args) {
        FabricaVehiculo fabricaVehiculo = new FabricaVehiculo();

        IVehiculo carro = fabricaVehiculo.crearVehiculo("Carro");
        carro.conducir();

        IVehiculo moto = fabricaVehiculo.crearVehiculo("Moto");
        moto.conducir();

        IVehiculo camion = fabricaVehiculo.crearVehiculo("Camion");
        camion.conducir();
    }
}
