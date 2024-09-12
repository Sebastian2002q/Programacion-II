package co.edu.uniquindio.gestionEmpleados.model.builder;

import co.edu.uniquindio.gestionEmpleados.model.Tecnico;

public class TecnicoBuilder extends EmpleadoBuilder<TecnicoBuilder>{
    @Override
    protected TecnicoBuilder self() {
        return this;
    }

    @Override
    public Tecnico build() {
        return new Tecnico(nombre, id, departamento, proyecto);
    }
}
