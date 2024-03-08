package org.ptech.java.citas.entities;

import org.ptech.java.citas.entities.enums.Especialidad;
import org.ptech.java.citas.entities.enums.TipoDocumento;


//Clases que heredan:
// - Clases Hijas
// - Subclases
// - Clases detalle
// - Clases específicas
public class Medico extends Usuario {

        //POR REGLA GENERAL:
        //los atributos de una clase
        //deben ser private

        private Long registroMedico;
        private Especialidad especialidad;

    

        public Medico(  int id, 
                        String nombres, 
                        String apellidos, 
                        TipoDocumento tipoDocumento, 
                        Long numeroDocumento,
                        Long registroMedico, 
                        Especialidad especialidad) {

        //Super hace refenrencia al comportamiento o metodos de la clase padre
        //Si se instancia un médico también se debe instanciar a la clase Usuario
        //super en el constructor(llama, ejecuta)
        //al constructor de la clase padre(superclase)
        //Super() La llamada al constructor de la superclase debe ser lo primero que aparezca 
        //en el constructor de la clase hija
            super(id, nombres, apellidos, tipoDocumento, numeroDocumento);
        //a continuacion inicializamos
        //atributos propios de la clase hija 
            this.registroMedico = registroMedico;
            this.especialidad = especialidad;
        }



        public Long getRegistroMedico() {
            return registroMedico;
        }



        public void setRegistroMedico(Long registroMedico) {
            this.registroMedico = registroMedico;
        }



        public Especialidad getEspecialidad() {
            return especialidad;
        }




        public void setEspecialidad(Especialidad especialidad) {
            this.especialidad = especialidad;
        }




        @Override
        public String toString() {
            return "Medico [registroMedico= " + registroMedico + ", especialidad= " + especialidad + "nombres= " + super.nombres + "]";
        }

    }
