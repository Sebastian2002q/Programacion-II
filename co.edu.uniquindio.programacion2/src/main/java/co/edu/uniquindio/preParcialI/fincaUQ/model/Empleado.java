package co.edu.uniquindio.preParcialI.fincaUQ.model;

import java.util.ArrayList;
import java.util.List;

public class Empleado {
    private String nombre;
    private String apellido;
    private String cedula;
    private int edad;
    private double salario;
    private int numeroHorasTrabajo;
    private TipoContrato tipoContrato;
    private List<Tarea> listTareasAsociadas = new ArrayList<>();
}
