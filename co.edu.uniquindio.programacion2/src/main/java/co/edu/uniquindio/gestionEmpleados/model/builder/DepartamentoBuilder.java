package co.edu.uniquindio.gestionEmpleados.model.builder;

import co.edu.uniquindio.gestionEmpleados.model.Departamento;

public class DepartamentoBuilder {
    protected String nombre;
    protected String codigo;

    public Departamento build(){
        return new Departamento(nombre, codigo);
    }

    public DepartamentoBuilder nombre(String nombre){
        this.nombre = nombre;
        return this;
    }

    public DepartamentoBuilder codigo(String codigo){
        this.codigo = codigo;
        return this;
    }
}