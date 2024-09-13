package co.edu.uniquindio.ejemploPrototype;

import co.edu.uniquindio.ejemploPrototype.model.Circulo;

public class MainEjemploPrototype {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(5, "Rojo");
        Circulo circulo2 = new Circulo(8, "Verde");

        Circulo circulo3 = (Circulo) circulo1.clone();

        System.out.println(circulo1);
        System.out.println(circulo2);
        System.out.println(circulo3);
    }
}
