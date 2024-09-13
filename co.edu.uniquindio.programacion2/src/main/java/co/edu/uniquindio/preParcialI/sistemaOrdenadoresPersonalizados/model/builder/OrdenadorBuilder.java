package co.edu.uniquindio.preParcialI.sistemaOrdenadoresPersonalizados.model.builder;

import co.edu.uniquindio.preParcialI.sistemaOrdenadoresPersonalizados.model.Ordenador;

public class OrdenadorBuilder {
    protected String procesador;
    protected String ram;
    protected String tarjetaGrafica;
    protected String almacenamiento;
    protected String fuenteAlimentacion;
    protected String sistemaRefrigeracion;
    protected String monitor;
    protected String teclado;
    protected String raton;

    public Ordenador build(){
        return new Ordenador(procesador,ram,tarjetaGrafica,almacenamiento,fuenteAlimentacion,sistemaRefrigeracion,monitor,teclado,raton);
    }

    public OrdenadorBuilder procesador(String procesador){
        this.procesador =  procesador;
        return this;
    }

    public OrdenadorBuilder ram(String ram){
        this.ram = ram;
        return this;
    }

    public OrdenadorBuilder tarjetaGrafica(String tarjetaGrafica){
        this.tarjetaGrafica = tarjetaGrafica;
        return this;
    }

    public OrdenadorBuilder almacenamiento(String almacenamiento){
        this.almacenamiento = almacenamiento;
        return this;
    }

    public OrdenadorBuilder fuenteAlimentacion(String fuenteAlimentacion){
        this.fuenteAlimentacion = fuenteAlimentacion;
        return this;
    }

    public OrdenadorBuilder sistemaRefrigeracion(String sistemaRefrigeracion){
        this.sistemaRefrigeracion = sistemaRefrigeracion;
        return this;
    }

    public OrdenadorBuilder monitor(String monitor){
        this.monitor = monitor;
        return this;
    }

    public OrdenadorBuilder teclado(String teclado){
        this.teclado = teclado;
        return this;
    }

    public OrdenadorBuilder raton(String raton){
        this.raton = raton;
        return this;
    }
}
