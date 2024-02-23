package org.ptech.java.citas;

import java.io.Console;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

import org.ptech.java.citas.entities.Cita;
import org.ptech.java.citas.entities.Consultorio;
import org.ptech.java.citas.entities.Especialidad;
import org.ptech.java.citas.entities.EstadoCita;
import org.ptech.java.citas.entities.Medico;
import org.ptech.java.citas.entities.Paciente;
import org.ptech.java.citas.entities.TipoDocumento;
import org.ptech.java.citas.entities.TipoSangre;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Crear un objeto medico
        //Instanciar medico
        //SOLUCIÓN 1 PARA ACCEDER A LOS ATRIBUTOS PRIVATE DE UNA CLASE: 
        //Una manera de dar valor 
        //a atributos privados en una clase
        //es a través del constructor
        //paramétrico
        Medico m = new Medico(1, 
                            "Andres Felipe", 
                            "Ochoa Perez", 
                            TipoDocumento.TI,
                            123456789L, 
                            0433434324L, 
                            Especialidad.OTORRINOLARINGOLOGIA);

        //Instanciar otro médico
        Medico m2 = new Medico();
        
        //  Se debe utilizar primero el setter
        // Del atributo a asignar
        m2.setNombres("Juan Carlos");
        m2.setApellidos("Villalba Pinzón");
        m2.setNumeroDocumento(398728939L);
        System.out.println(m2.getNombres() + "  " + m2.getApellidos());

        Paciente paciente1 = new Paciente(  1,
                                            "Juana", 
                                            "Ramírez", 
                                            TipoDocumento.CC, 
                                            1234567890L, 
                                            "juana@gmail.com", 
                                            3004567788L, 
                                            LocalDate.of(1992, Month.APRIL, 23),
                                            1.65,
                                            56.0,
                                            TipoSangre.B,
                                            '+'             
                                            );

        Consultorio consultorio1 = new Consultorio();

        consultorio1.setId(1);
        consultorio1.setDireccion("Cll 34 sur #32");
        consultorio1.setNumero(1);

        Cita cita1 = new Cita();

        cita1.setId(1);
        cita1.setConsultorio(consultorio1);
        cita1.setEstado(EstadoCita.AGENDADA);
        cita1.setMedico(m);
        cita1.setPaciente(paciente1);
        cita1.setFecha(LocalDateTime.of(2024, Month.FEBRUARY, 23, 9, 30, 0));

        System.out.println(cita1.getId() + " " +
                            cita1.getConsultorio() + " " +
                            cita1.getEstado() + " " +
                            cita1.getFecha() + " " +
                            cita1.getMedico() + " " +
                            cita1.getPaciente());
    }
}