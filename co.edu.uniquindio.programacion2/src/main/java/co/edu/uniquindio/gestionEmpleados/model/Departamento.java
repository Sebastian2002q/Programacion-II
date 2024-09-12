package co.edu.uniquindio.gestionEmpleados.model;

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
}