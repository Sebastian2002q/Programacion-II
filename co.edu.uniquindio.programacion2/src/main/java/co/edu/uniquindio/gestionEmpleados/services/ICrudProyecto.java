package co.edu.uniquindio.gestionEmpleados.services;

import co.edu.uniquindio.gestionEmpleados.model.Presupuesto;
import co.edu.uniquindio.gestionEmpleados.model.Proyecto;

import java.util.ArrayList;

public interface ICrudProyecto {

    boolean crearProyecto(String nombre, String codigo, Presupuesto presupuestoAsociado);
    boolean eliminarProyecto(String codigo);
    boolean modificarProyecto(String codigo, String nombre);
    Proyecto getProyecto(String codigo);
    ArrayList<Proyecto> getProyectos();
}
