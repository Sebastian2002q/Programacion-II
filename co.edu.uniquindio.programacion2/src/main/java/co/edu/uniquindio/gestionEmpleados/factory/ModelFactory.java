package co.edu.uniquindio.gestionEmpleados.factory;

import co.edu.uniquindio.gestionEmpleados.model.*;
import co.edu.uniquindio.gestionEmpleados.services.ICrudDepartamento;
import co.edu.uniquindio.gestionEmpleados.services.ICrudEmpleado;
import co.edu.uniquindio.gestionEmpleados.services.ICrudProyecto;

import java.util.ArrayList;

public class ModelFactory implements ICrudEmpleado, ICrudDepartamento, ICrudProyecto {
    private static ModelFactory instance;
    private static Empresa empresa;

    private ModelFactory(){
        inicializarDatos();
    }

    public static ModelFactory getInstance(){
        if (instance == null){
            instance = new ModelFactory();
        }
        return instance;
    }

    @Override
    public boolean crearEmpleado(String nombre, String id, Departamento departamento, Proyecto proyecto, TipoEmpleado tipoEmpleado) {
        return empresa.crearEmpleado(nombre, id, departamento, proyecto,tipoEmpleado);
    }

    @Override
    public boolean eliminarEmpleado(String id) {
        return empresa.eliminarEmpleado(id);
    }

    @Override
    public boolean modificarEmpleado(String id, Departamento departamento) {
        return empresa.modificarEmpleado(id, departamento);
    }

    @Override
    public Empleado getEmpleado(String id) {
        return empresa.getEmpleado(id);
    }

    @Override
    public ArrayList<Empleado> getEmpleados() {
        return empresa.getEmpleados();
    }

    @Override
    public boolean crearDepartamento(String nombre, String codigo) {
        return empresa.crearDepartamento(nombre, codigo);
    }

    @Override
    public boolean eliminarDepartamento(String codigo) {
        return empresa.eliminarDepartamento(codigo);
    }

    @Override
    public boolean modificarDepartamento(String codigo, String nombre) {
        return empresa.modificarDepartamento(codigo, nombre);
    }

    @Override
    public Departamento getDepartamento(String codigo) {
        return empresa.getDepartamento(codigo);
    }

    @Override
    public ArrayList<Departamento> getDepartamentos() {
        return empresa.getDepartamentos();
    }

    @Override
    public boolean crearProyecto(String nombre, String codigo) {
        return empresa.crearProyecto(nombre, codigo);
    }

    @Override
    public boolean eliminarProyecto(String codigo) {
        return empresa.eliminarProyecto(codigo);
    }

    @Override
    public boolean modificarProyecto(String codigo, String nombre) {
        return empresa.modificarProyecto(codigo, nombre);
    }

    @Override
    public Proyecto getProyecto(String codigo) {
        return empresa.getProyecto(codigo);
    }

    @Override
    public ArrayList<Proyecto> getProyectos() {
        return empresa.getProyectos();
    }

    /**
     * Inicializa los datos de la empresa, incluyendo empleados, proyectos y despartamentos.
     *
     * @return una instancia de Empresa con datos predefinidos.
     */
    private static void inicializarDatos() {
        empresa = new Empresa();
        empresa.setNombre("EmpresaPiloto");
    }
}
