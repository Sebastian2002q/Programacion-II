package co.edu.uniquindio.gestionEmpleados.model;

import co.edu.uniquindio.gestionEmpleados.services.ICrudEmpleado;

import java.util.List;
import java.util.ArrayList;


public class Empresa implements ICrudEmpleado {
    private List<Empleado> listEmpleados = new ArrayList<>();
    private List<Proyecto> listProyectos = new ArrayList<>();
    private List<Departamento> listDepartamentos = new ArrayList<>();

    public Empresa(){
    }

    private Empleado verificarEmpleado(String id) {
        Empleado empleadoExistente = null;

        for(Empleado empleado : listEmpleados){
            if(empleado.getId().equals(id)){
                empleadoExistente = empleado;
                break;
            }
        }
        return empleadoExistente;
    }

    @Override
    public boolean crearEmpleado(String nombre, String id, Departamento departamento, TipoEmpleado tipoEmpleado){
        Empleado newEmpleado = verificarTipoEmpleado(tipoEmpleado);
        Empleado empleadoExistente = verificarEmpleado(id);

        if(empleadoExistente == null){
            if(newEmpleado instanceof Gerente){
                newEmpleado.setNombre(nombre);
                newEmpleado.setId(id);
                newEmpleado.setDepartamento(departamento);
                listEmpleados.add(newEmpleado);
                return true;
            }
        }
        return false;
    }

    private Empleado verificarTipoEmpleado(TipoEmpleado tipoEmpleado) {
        if(tipoEmpleado == TipoEmpleado.GERENTE){
            return new Gerente();
        }
        return new Tecnico();
    }

    @Override
    public boolean eliminarEmpleado(String id) {
        Empleado empleado = verificarEmpleado(id);

        if(empleado != null){
            listEmpleados.remove(empleado);
            return true;
        }
        return false;
    }

    @Override
    public boolean modificarEmpleado(String id, Departamento departamento) {
        Empleado empleado = verificarEmpleado(id);
        if(empleado != null){
            empleado.setDepartamento(departamento);
            return true;
        }
        return false;
    }

    @Override
    public Empleado getEmpleado(String id) {
        return verificarEmpleado(id);
    }

    @Override
    public ArrayList<Empleado> getEmpleados() {
        return (ArrayList<Empleado>) listEmpleados;
    }
}
