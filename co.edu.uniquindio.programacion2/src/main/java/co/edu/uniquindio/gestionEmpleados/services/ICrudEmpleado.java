package co.edu.uniquindio.gestionEmpleados.services;

import co.edu.uniquindio.gestionEmpleados.model.Departamento;
import co.edu.uniquindio.gestionEmpleados.model.Empleado;
import co.edu.uniquindio.gestionEmpleados.model.Proyecto;
import co.edu.uniquindio.gestionEmpleados.model.TipoEmpleado;

import java.util.ArrayList;

public interface ICrudEmpleado {
    boolean crearEmpleado(String nombre, String id, Departamento departamento, Proyecto proyecto, TipoEmpleado tipoEmpleado);
    boolean eliminarEmpleado(String id);
    boolean modificarEmpleado(String id, Departamento departamento);
    Empleado getEmpleado(String id);
    ArrayList<Empleado> getEmpleados();
}