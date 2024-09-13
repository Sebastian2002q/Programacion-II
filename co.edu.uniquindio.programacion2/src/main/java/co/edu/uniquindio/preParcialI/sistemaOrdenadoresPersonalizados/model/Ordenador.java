package co.edu.uniquindio.preParcialI.sistemaOrdenadoresPersonalizados.model;

import co.edu.uniquindio.preParcialI.sistemaOrdenadoresPersonalizados.model.builder.OrdenadorBuilder;

public class Ordenador {
    private String procesador;
    private String ram;
    private String tarjetaGrafica;
    private String almacenamiento;
    private String fuenteAlimentacion;
    private String sistemaRefrigeracion;
    private String monitor;
    private String teclado;
    private String raton;

    public Ordenador(String procesador, String ram, String tarjetaGrafica, String almacenamiento, String fuenteAlimentacion, String sistemaRefrigeracion, String monitor, String teclado, String raton){
        this.procesador = procesador;
        this.ram = ram;
        this.tarjetaGrafica = tarjetaGrafica;
        this.almacenamiento = almacenamiento;
        this.fuenteAlimentacion = fuenteAlimentacion;
        this.sistemaRefrigeracion = sistemaRefrigeracion;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }

     public static OrdenadorBuilder builder(){
        return new OrdenadorBuilder();
     }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getTarjetaGrafica() {
        return tarjetaGrafica;
    }

    public void setTarjetaGrafica(String tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getSistemaRefrigeracion() {
        return sistemaRefrigeracion;
    }

    public void setSistemaRefrigeracion(String sistemaRefrigeracion) {
        this.sistemaRefrigeracion = sistemaRefrigeracion;
    }

    public String getFuenteAlimentacion() {
        return fuenteAlimentacion;
    }

    public void setFuenteAlimentacion(String fuenteAlimentacion) {
        this.fuenteAlimentacion = fuenteAlimentacion;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getTeclado() {
        return teclado;
    }

    public void setTeclado(String teclado) {
        this.teclado = teclado;
    }

    public String getRaton() {
        return raton;
    }

    public void setRaton(String raton) {
        this.raton = raton;
    }
}
