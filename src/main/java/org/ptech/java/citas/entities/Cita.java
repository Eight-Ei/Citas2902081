package org.ptech.java.citas.entities;
import java.time.LocalDateTime;

import org.ptech.java.citas.entities.enums.EstadoCita;

public class Cita {

    private int id;
    private LocalDateTime fecha;
    private Medico medico;
    private Paciente paciente;
    private Consultorio consultorio;
    private EstadoCita estado;

    public Cita() {

    }

    public Cita(int id, LocalDateTime fecha, Medico medico, Paciente paciente, Consultorio consultorio,
            EstadoCita estado) {
        this.id = id;
        this.fecha = fecha;
        this.medico = medico;
        this.paciente = paciente;
        this.consultorio = consultorio;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Consultorio getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }

    public EstadoCita getEstado() {
        return estado;
    }

    public void setEstado(EstadoCita estado) {
        this.estado = estado;
    }

    
    
    
}
