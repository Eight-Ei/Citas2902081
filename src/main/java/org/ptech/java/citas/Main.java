package org.ptech.java.citas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

import org.ptech.java.citas.entities.Cita;
import org.ptech.java.citas.entities.CitaEnfermero;
import org.ptech.java.citas.entities.CitaMedico;
import org.ptech.java.citas.entities.Consultorio;
import org.ptech.java.citas.entities.Enfermero;
import org.ptech.java.citas.entities.Medico;
import org.ptech.java.citas.entities.Paciente;
import org.ptech.java.citas.entities.enums.Especialidad;
import org.ptech.java.citas.entities.enums.EstadoCita;
import org.ptech.java.citas.entities.enums.Motivo;
import org.ptech.java.citas.entities.enums.TipoDocumento;
import org.ptech.java.citas.entities.enums.TipoSangre;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        
        //Crear medicos
        Medico m1 = new Medico(1,
                            "Cristian", 
                            "Jimenez", 
                            TipoDocumento.CC,
                            123456790L,
                            33445566L, 
                            Especialidad.CARDIOLOGIA);

        Medico m2 = new Medico(2,
                            "Jovanna", 
                            "Hernández", 
                            TipoDocumento.CC,
                            222443790L,
                            201445566L, 
                            Especialidad.MEDICINA_GENERAL);

        //Crear un enfermeros
        Enfermero e1 = new Enfermero(1,
                                    "Alejandra",
                                    "Lopez",
                                    TipoDocumento.PPT,
                                    2342342L);

        Enfermero e2 = new Enfermero(2,
                                    "Fernanda",
                                    "Cardozo",
                                    TipoDocumento.PPT,
                                    23212342L);

        Enfermero e3 = new Enfermero(2,
                                    "Dana",
                                    "Suarez",
                                    TipoDocumento.PPT,
                                    23212342L);

        Paciente p1 = new Paciente(1,
                                    "Luis", 
                                    "Pedreros",
                                    TipoDocumento.CC, 
                                    24219924822L, 
                                    "Pepedreros@gmail.com", 
                                    3113455242L,
                                    LocalDate.of(2000, Month.AUGUST, 22),
                                    1.80, 
                                    70, 
                                    TipoSangre.O, 
                                    '+');
        
        Paciente p2 = new Paciente(2,
                                    "Daniela", 
                                    "Trujillo",
                                    TipoDocumento.CC, 
                                    92119924822L, 
                                    "Danit@gmail.com", 
                                    3124988242L,
                                    LocalDate.of(1999, Month.MARCH, 10),
                                    1.67, 
                                    56, 
                                    TipoSangre.A, 
                                    '+');

        Paciente p3 = new Paciente(3,
                                    "Samuel", 
                                    "Bejarano",
                                    TipoDocumento.CC, 
                                    98219924822L, 
                                    "Samben@gmail.com", 
                                    3454988242L,
                                    LocalDate.of(1998, Month.DECEMBER, 31),
                                    1.70, 
                                    58, 
                                    TipoSangre.AB, 
                                    '-');

        
        Paciente p4 = new Paciente(4,
                                    "Julián", 
                                    "Gutierrez",
                                    TipoDocumento.CC, 
                                    232519924822L, 
                                    "Juliangut@gmail.com", 
                                    3504988242L,
                                    LocalDate.of(1997, Month.APRIL, 20),
                                    1.70, 
                                    60, 
                                    TipoSangre.O, 
                                    '+');
        
        Paciente p5 = new Paciente(5,
                                    "Eliana", 
                                    "Díaz",
                                    TipoDocumento.CC, 
                                    12345924822L, 
                                    "fiaseli@gmail.com", 
                                    3124348242L,
                                    LocalDate.of(1996, Month.JANUARY, 2),
                                    1.57, 
                                    53, 
                                    TipoSangre.A, 
                                    '+');


        Consultorio c1 = new Consultorio(1, "Calle 100", 206);
        Consultorio c2 = new Consultorio(2, "Calle 100", 207);
        Consultorio c3 = new Consultorio(3, "Calle 100", 208);
        Consultorio c4 = new Consultorio(4, "Calle 100", 209);
        Consultorio c5 = new Consultorio(5, "Calle 100", 210);

   


        CitaMedico cm1 = new CitaMedico(1, LocalDateTime.of(2024, Month.APRIL, 23, 7, 30, 00), c1, p1, m1, EstadoCita.AGENDADA, Motivo.ESCOPOLAMINA);
        CitaMedico cm2 = new CitaMedico(2, LocalDateTime.of(2024, Month.APRIL, 24, 7, 30, 00), c2, p2, m2, EstadoCita.AGENDADA,  Motivo.GRIPE);
             
        cm1.cancelarCita();
        
        System.out.println("Fecha: "  + cm1.getFecha() + " "   + " Consultorio: "+ c1.getNumero() +  " " + " Medico :" + m1.getNombres() + " "  + m1.getApellidos() + " " + " Estado: " + cm1.getEstado() );

        CitaEnfermero ce3 = new CitaEnfermero(1, LocalDateTime.of(2024, Month.APRIL, 25, 7, 30, 00), c3, p3, e1, EstadoCita.AGENDADA, "Vacuna");
        CitaEnfermero ce4 = new CitaEnfermero(2, LocalDateTime.of(2024, Month.APRIL, 26, 7, 30, 00), c4, p4, e2, EstadoCita.CANCELADA, "Lavado de oídos");



        System.out.println("Fecha: " + " " + ce3.getFecha() + " Consultorio: " + c3.getNumero() + " " + " Enfermero: " + " " + e1.getNombres() + " " + e1.getApellidos() + " " + " Estado: " + cm1.getEstado() );



        //Añadir dos procedimientos al enfermero
        e1.addProcedure("Vacuna");
        e1.addProcedure("Lavado de oidos");

        e2.addProcedure("Vacuna");
        e2.addProcedure("Lavado de oidos");

        //Recorrer los procedimientos de e1
        for( String p : e1.getProcedimientos()){
                System.out.println("Procedimiento: " + p);
        }

    }
}