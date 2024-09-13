package co.edu.uniquindio.preParcialI.sistemaOrdenadoresPersonalizados;

import co.edu.uniquindio.preParcialI.sistemaOrdenadoresPersonalizados.model.Ordenador;

public class MainSistemaOrdenadoresPersonalizados {
    public static void main(String[] args) {
        Ordenador ordenardor = Ordenador.builder().procesador("Intel").build();
        Ordenador ordenadorGaming = Ordenador.builder()
                .procesador("AMD")
                .ram("32GB")
                .almacenamiento("1TB")
                .monitor("Samsung")
                .fuenteAlimentacion("600W")
                .sistemaRefrigeracion("Liquido")
                .tarjetaGrafica("RTX4090")
                .teclado("Mecanico")
                .raton("logitech")
                .build();
    }
}
