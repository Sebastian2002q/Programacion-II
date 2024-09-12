package co.edu.uniquindio.gestionEmpleados.services;

import co.edu.uniquindio.gestionEmpleados.model.Departamento;
import co.edu.uniquindio.gestionEmpleados.model.Empleado;
import java.util.ArrayList;

public interface ICrudEmpleado {
    boolean crearEmpleado(String nombre, String id, Departamento departamento);
    boolean eliminarEmpleado(String id);
    boolean modificarEmpleado(String id, Departamento departamento);
    Empleado getEmpleado(String id);
    ArrayList<Empleado> getEmpleados();
}