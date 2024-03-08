package org.ptech.java.citas.citas.interfaces;

import java.time.LocalDateTime;
import org.ptech.java.citas.entities.Consultorio;

public interface IAgendable {

    //Propner un metodo para agendar cita
    public boolean agendarCita(LocalDateTime fecha, Consultorio c);

    //proponer un metodo para reagendar cita
    public boolean reAgendarCita(LocalDateTime nuevaFecha, Consultorio nuevoc);

    public boolean cancelarCita();
}
