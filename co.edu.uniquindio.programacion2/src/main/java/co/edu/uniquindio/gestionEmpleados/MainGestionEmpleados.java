package co.edu.uniquindio.gestionEmpleados;

import co.edu.uniquindio.gestionEmpleados.factory.ModelFactory;
import co.edu.uniquindio.gestionEmpleados.model.Departamento;
import co.edu.uniquindio.gestionEmpleados.model.Empleado;
import co.edu.uniquindio.gestionEmpleados.model.Proyecto;
import co.edu.uniquindio.gestionEmpleados.model.TipoEmpleado;
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
    }

    public static void crearEmpleado(ModelFactory modelFactory) {
        boolean creado = modelFactory.crearEmpleado("Sebastian","1234", new Departamento(), new Proyecto(), TipoEmpleado.GERENTE);
        System.out.println("El proceso de creacion ha finalizado con un estado de: " + creado);
    }

    public static void eliminarEmpleado(ModelFactory modelFactory) {
        boolean eliminado = modelFactory.eliminarEmpleado("1234");
        System.out.println("El proceso de eliminacion ha finalizado con un estado de: " + eliminado);
    }
}
