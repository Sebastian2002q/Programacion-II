package co.edu.uniquindio.ejemploFactory;

import co.edu.uniquindio.ejemploFactory.model.Camion;
import co.edu.uniquindio.ejemploFactory.model.Carro;
import co.edu.uniquindio.ejemploFactory.model.Moto;
import co.edu.uniquindio.ejemploFactory.services.IVehiculo;

public class FabricaVehiculo {
    /**
     * Método para crear un Vehiculo según el tipo especificado.
     *
     * @param tipoVehiculo Tipo de vehículo que se desea crear.
     * @return Una instancia de Vehiculo.
     */
    public IVehiculo crearVehiculo(String tipoVehiculo) {
        switch (tipoVehiculo.toLowerCase()) {
            case "carro":
                return new Carro();
            case "camion":
                return new Camion();
            case "moto":
                return new Moto();
            default:
                throw new IllegalArgumentException("Tipo de vehiculo no valido: " + tipoVehiculo);
        }
    }
}
