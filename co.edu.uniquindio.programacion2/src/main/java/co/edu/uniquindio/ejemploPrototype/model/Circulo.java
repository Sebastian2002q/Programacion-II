package co.edu.uniquindio.ejemploPrototype.model;

import co.edu.uniquindio.ejemploPrototype.services.IPrototype;

public class Circulo implements IPrototype {
    private double radio;
    private String color;

    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }



    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public IPrototype clone() {
        Circulo circulo = null;
        try {
            circulo = (Circulo) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return circulo;
    }
}
