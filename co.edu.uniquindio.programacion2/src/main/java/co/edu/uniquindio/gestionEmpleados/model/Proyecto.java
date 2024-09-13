package co.edu.uniquindio.gestionEmpleados.model;

import java.util.ArrayList;
import java.util.List;

public class Proyecto {
    private String nombre;
    private String codigo;
    private List<Empleado> listEmpleados = new ArrayList<Empleado>();

    public Proyecto() {}

    public Proyecto(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    /**
     * Verifica si un empleado ya existe
     *
     * @param id del empleado a verificar
     * @return un empleado encontrado o null si no existe
     */
    private Empleado verificarEmpleado(String id) {
        Empleado empleadoExistente = null;
        for (Empleado empleado : listEmpleados) {
            if (empleado.getId().equals(id)) {
                empleadoExistente = empleado;
                break;
            }
        }
        return empleadoExistente;
    }

    /**
     * Registra un empleado a la lista de empleados
     *
     * @param empleado a registrar
     */
    public void registrarEmpleado(Empleado empleado) {
        Empleado newEmpleado = verificarEmpleado(empleado.getId());

        if(newEmpleado == null){
            listEmpleados.add(empleado);
        }
    }

    /**
     * Elimina un empleado de la lista de empleados
     *
     * @param empleado a eliminar
     */
    public void eliminarEmpleado(Empleado empleado) {
        Empleado newEmpleado = verificarEmpleado(empleado.getId());

        if(newEmpleado != null){
            listEmpleados.remove(empleado);
        }
    }

    public ArrayList<Empleado> getEmpleados() {
        return (ArrayList<Empleado>) listEmpleados;
    }

    @Override
    public String toString() {
        return "Proyecto{" +
                "nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", listEmpleados=" + listEmpleados +
                '}';
    }
}
