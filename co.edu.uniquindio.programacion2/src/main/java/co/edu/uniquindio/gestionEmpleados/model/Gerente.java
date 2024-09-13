package co.edu.uniquindio.gestionEmpleados.model;

import co.edu.uniquindio.gestionEmpleados.services.IContribuyente;

public class Gerente extends Empleado implements IContribuyente {

    public Gerente(){}

    public Gerente(String nombre, String id, Departamento departamento, Proyecto proyecto){
        super(nombre, id, departamento, proyecto);
    }

    @Override
    public String Contribuir() {
        return "El gerente hizo una contribucion";
    }
}