package co.edu.uniquindio.gestionEmpleados.services;

import co.edu.uniquindio.gestionEmpleados.model.Estado;
import co.edu.uniquindio.gestionEmpleados.model.Presupuesto;
import co.edu.uniquindio.gestionEmpleados.model.Proyecto;

import java.util.ArrayList;

public interface ICrudPresupuesto {
    boolean crearPresupuesto(String idPresupuesto, double valor, String descripcion, Estado estado, Proyecto proyectoAsociado);
    boolean eliminarPresupuesto(String idPresupuesto);
    boolean modificarPresupuesto(String idPresupuesto, double valor, String descripcion, Estado estado, Proyecto proyectoAsociado);
    Presupuesto getPresupuesto(String idPresupuesto);
    ArrayList<Presupuesto> getPresupuestos();
}
