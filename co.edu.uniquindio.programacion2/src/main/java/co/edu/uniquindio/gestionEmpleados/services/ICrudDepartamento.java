package co.edu.uniquindio.gestionEmpleados.services;

import co.edu.uniquindio.gestionEmpleados.model.Departamento;
import java.util.ArrayList;

public interface ICrudDepartamento {
    boolean crearDepartamento(String nombre, String codigo);
    boolean eliminarDepartamento(String codigo);
    boolean modificarDepartamento(String codigo, String nombre);
    Departamento getDepartamento(String codigo);
    ArrayList<Departamento> getDepartamentos();
}
