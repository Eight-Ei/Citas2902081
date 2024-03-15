package org.ptech.java.citas.entities;

import java.time.LocalDateTime;

import org.ptech.java.citas.citas.interfaces.IAgendable;
import org.ptech.java.citas.entities.enums.EstadoCita;
import org.ptech.java.citas.entities.enums.Motivo;

public class CitaMedico extends Cita implements IAgendable {

    Medico medico;
    EstadoCita estado;
    Motivo motivo;
    

    public CitaMedico(Medico medico, EstadoCita estado, Motivo motivo) {
        this.medico = medico;
        this.estado = estado;
        this.motivo = motivo;
    }

    public CitaMedico(int id, LocalDateTime fecha, Consultorio consultorio, Paciente paciente, Medico medico,
            EstadoCita estado, Motivo motivo) {
        super(id, fecha, consultorio, paciente);
        this.medico = medico;
        this.estado = estado;
        this.motivo = motivo;
    }

    

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public EstadoCita getEstado() {
        return estado;
    }

    public void setEstado(EstadoCita estado) {
        this.estado = estado;
    }

    public Motivo getMotivo() {
        return motivo;
    }

    public void setMotivo(Motivo motivo) {
        this.motivo = motivo;
    }

    @Override
    public boolean agendarCita(LocalDateTime fecha, Consultorio c) {
        this.setFecha(fecha);
        this.setConsultorio(c);
        return true;
    }

    @Override
    public boolean reAgendarCita(LocalDateTime nuevaFecha, Consultorio nuevoc) {
        this.setFecha(nuevaFecha);
        this.setConsultorio(nuevoc);
        return true;
    }

    @Override
    public boolean cancelarCita() {
        this.estado = EstadoCita.CANCELADA;
        return true;
    }


}

