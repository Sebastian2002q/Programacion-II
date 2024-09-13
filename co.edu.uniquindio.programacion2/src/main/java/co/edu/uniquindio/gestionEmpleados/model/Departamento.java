package co.edu.uniquindio.gestionEmpleados.model;

import co.edu.uniquindio.gestionEmpleados.model.builder.DepartamentoBuilder;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nombre;
    private String codigo;
    private List<Empleado> listEmpleados = new ArrayList<Empleado>();

    public Departamento(){}

    public Departamento(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public static DepartamentoBuilder builder(){
        return new DepartamentoBuilder();
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
        return "Departamento{" +
                "nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", listEmpleados=" + listEmpleados +
                '}';
    }
}