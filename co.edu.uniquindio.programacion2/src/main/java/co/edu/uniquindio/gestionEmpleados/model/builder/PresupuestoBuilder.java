package co.edu.uniquindio.gestionEmpleados.model.builder;

import co.edu.uniquindio.gestionEmpleados.model.Estado;
import co.edu.uniquindio.gestionEmpleados.model.Presupuesto;
import co.edu.uniquindio.gestionEmpleados.model.Proyecto;

public class PresupuestoBuilder {
    protected String idPresupuesto;
    protected double valor;
    protected String descripcion;
    protected Estado estado;
    protected Proyecto proyectoAsociado;

    public Presupuesto build(){
        return new Presupuesto(idPresupuesto, valor, descripcion, estado, proyectoAsociado);
    }

    public PresupuestoBuilder idPresupuesto(String idPresupuesto){
        this.idPresupuesto = idPresupuesto;
        return this;
    }

    public PresupuestoBuilder valor(double valor){
        this.valor = valor;
        return this;
    }

    public PresupuestoBuilder descripcion(String descripcion){
        this.descripcion = descripcion;
        return this;
    }

    public PresupuestoBuilder estado(Estado estado){
        this.estado = estado;
        return this;
    }

    public PresupuestoBuilder proyectoAsociado(Proyecto proyectoAsociado){
        this.proyectoAsociado = proyectoAsociado;
        return this;
    }
}