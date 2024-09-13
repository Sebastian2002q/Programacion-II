package co.edu.uniquindio.gestionEmpleados.model;

import co.edu.uniquindio.gestionEmpleados.services.IContribuyente;

public class Tecnico extends Empleado implements IContribuyente {

    public Tecnico(){}

    public Tecnico(String nombre, String id, Departamento departamento, Proyecto proyecto){
        super(nombre, id, departamento, proyecto);
    }

    @Override
    public String Contribuir() {
        return "El tecnico hizo una contribucion";
    }
}
