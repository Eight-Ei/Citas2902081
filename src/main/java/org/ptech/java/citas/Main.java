package org.ptech.java.citas;

import org.ptech.java.citas.entities.Enfermero;
import org.ptech.java.citas.entities.Medico;
import org.ptech.java.citas.entities.enums.Especialidad;
import org.ptech.java.citas.entities.enums.TipoDocumento;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        
        //Crear medico
        Medico m1 = new Medico(1,
                            "Cristian Andres", 
                            "Buitrago Jimenez", 
                            TipoDocumento.CC,
                            123456790L,
                            33445566L, 
                            Especialidad.CARDIOLOGIA);

        System.out.println("El id del medico: " + m1.getId() + " " + "El nombre del medico: " + m1.getNombres() + " " +  
                            "Apellidos del medico: " + m1.getApellidos() + " " + "Especialidad medico: " + m1.getEspecialidad());

        
        //Crear un enfermero:
        Enfermero e1 = new Enfermero(1,
                                    "Alejandra",
                                    "Lopez",
                                    TipoDocumento.PPT,
                                    2342342L);
        
        //Añadir dos procedimientos al enfermero
        e1.addProcedure("Aplicar Inyecciones");
        e1.addProcedure("Lavado de oidos");

        //Recorrer los procedimientos de e1
        for( String p : e1.getProcedimientos()){
                System.out.println("Procedimiento: " + p);
        }

    }
}