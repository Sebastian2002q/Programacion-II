package co.edu.uniquindio.gestionEmpleados.model.builder;

import co.edu.uniquindio.gestionEmpleados.model.Empleado;
import co.edu.uniquindio.gestionEmpleados.model.Presupuesto;
import co.edu.uniquindio.gestionEmpleados.model.Proyecto;

import java.util.ArrayList;
import java.util.List;

public class ProyectoBuilder {
    protected String nombre;
    protected String codigo;
    protected Presupuesto presupuestoAsociado;

    public Proyecto build(){
        return new Proyecto(nombre,codigo,presupuestoAsociado);
    }

    public ProyectoBuilder nombre(String nombre){
        this.nombre = nombre;
        return this;
    }

    public ProyectoBuilder codigo(String codigo){
        this.codigo = codigo;
        return this;
    }

    public ProyectoBuilder presupuestoAsociado(Presupuesto presupuestoAsociado){
        this.presupuestoAsociado = presupuestoAsociado;
        return this;
    }
}
