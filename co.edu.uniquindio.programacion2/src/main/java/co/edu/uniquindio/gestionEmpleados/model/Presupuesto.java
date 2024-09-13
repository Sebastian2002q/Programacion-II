package co.edu.uniquindio.gestionEmpleados.model;

import co.edu.uniquindio.gestionEmpleados.model.builder.PresupuestoBuilder;

public class Presupuesto {
    private String idPresupuesto;
    private double valor;
    private String descripcion;
    private Estado estado;
    private Proyecto proyectoAsociado;

    public Presupuesto(){}

    public Presupuesto(String idPresupuesto, double valor, String descripcion, Estado estado, Proyecto proyectoAsociado) {
        this.idPresupuesto = idPresupuesto;
        this.valor = valor;
        this.descripcion = descripcion;
        this.estado = estado;
        this.proyectoAsociado = proyectoAsociado;
    }

    public static PresupuestoBuilder builder(){
        return new PresupuestoBuilder();
    }

    public String getIdPresupuesto() {
        return idPresupuesto;
    }

    public void setIdPresupuesto(String idPresupuesto) {
        this.idPresupuesto = idPresupuesto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Proyecto getProyectoAsociado() {
        return proyectoAsociado;
    }

    public void setProyectoAsociado(Proyecto proyectoAsociado) {
        this.proyectoAsociado = proyectoAsociado;
    }
}