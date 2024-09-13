package co.edu.uniquindio.gestionEmpleados;

import co.edu.uniquindio.gestionEmpleados.factory.ModelFactory;
import co.edu.uniquindio.gestionEmpleados.model.*;
import co.edu.uniquindio.gestionEmpleados.model.builder.EmpleadoBuilder;
import co.edu.uniquindio.gestionEmpleados.model.builder.GerenteBuilder;

public class MainGestionEmpleados {
    public static void main(String[] args) {
        ModelFactory modelFactory = ModelFactory.getInstance();
        crudEmpleado(modelFactory);
    }

    public static void crudEmpleado(ModelFactory modelFactory) {
        crearEmpleado(modelFactory);
        eliminarEmpleado(modelFactory);
        presupuestoPorEstado(modelFactory);
    }

    public static void crearEmpleado(ModelFactory modelFactory) {
        boolean creado = modelFactory.crearEmpleado("Sebastian","1234", new Departamento(), new Proyecto(), TipoEmpleado.GERENTE);
        System.out.println("El proceso de creacion ha finalizado con un estado de: " + creado);
    }

    public static void eliminarEmpleado(ModelFactory modelFactory) {
        boolean eliminado = modelFactory.eliminarEmpleado("1234");
        System.out.println("El proceso de eliminacion ha finalizado con un estado de: " + eliminado);
    }

    public static void presupuestoPorEstado(ModelFactory modelFactory){
        int numPresupuesto = modelFactory.presupuestosPorEstado(Estado.DISPONIBLE);
        System.out.println("El numero de presupuestos en estado disponible es: " + numPresupuesto );
    }
}