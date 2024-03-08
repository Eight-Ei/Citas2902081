package org.ptech.java.citas.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

import org.ptech.java.citas.entities.enums.Especialidad;
import org.ptech.java.citas.entities.enums.EstadoCita;
import org.ptech.java.citas.entities.enums.TipoDocumento;
import org.ptech.java.citas.entities.enums.TipoSangre;

public class PruebasPolimorfismo {

    public static void main(String[] args) {
       
        //imtanciar un usario
        Medico u = new Medico(1, "cristian", "buitrago", TipoDocumento.CC, 12345678L, 9876543L, Especialidad.DERMATOLOGIA);
        
        System.out.println(u.toString());

        Paciente p = new Paciente (2, "laura", 
                                    "hernandez", 
                                    TipoDocumento.TI,
                                     654789321L, 
                                     "lau@gmail.com", 
                                     3122234343L,  
                                     LocalDate.of(2024, Month.MARCH, 24), 
                                     1.76, 58.5, 
                                     TipoSangre.A, '+');

        System.out.println(p.toString());

        Consultorio j = new Consultorio(1, "Narnia", 69);


        System.out.println(j.toString());

        Enfermero e = new Enfermero(1, "Andres", "Loaiza", TipoDocumento.CC, 8732942839L);

        System.out.println(e.toString());


        //Cita c = new Cita(1, LocalDateTime.of(2024, Month.APRIL, 23, 12, 0, 0), p, EstadoCita.AGENDADA );

        
        //System.out.println(c.toString());


    }

}
