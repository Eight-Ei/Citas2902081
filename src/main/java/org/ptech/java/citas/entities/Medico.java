package org.ptech.java.citas.entities;

    public class Medico {

        //POR REGLA GENERAL:
        //los atributos de una clase
        //deben ser private
        private int id;
        private String nombres;
        private String apellidos;
        private TipoDocumento tipoDocumento;
        private Long numeroDocumento;
        private Long registroMedico;
        private Especialidad especialidad;


        //constructor por defcto
        //siempre debe ser public
        public Medico() {

        }

        public Medico(int id, String nombres, String apellidos, TipoDocumento tipoDocumento, Long numeroDocumento,
                Long registroMedico, Especialidad especialidad) {
            this.id = id;
            this.nombres = nombres;
            this.apellidos = apellidos;
            this.tipoDocumento = tipoDocumento;
            this.numeroDocumento = numeroDocumento;
            this.registroMedico = registroMedico;
            this.especialidad = especialidad;
        }


        //Getters y setters, todos deben ser publicos
        //Firma de un getter
        //El tipo de dato de retorno:
        //              es el t.d del atributo
        //Nombre del método:
        //              get seguido del nombre del atributo
        //Parametros: 0
        //Retorna el valor del atributo 
        public String getNombres() {
            //Return sirve para retornar el valor al invocante
            return this.nombres;
        }

        //Sirve para asignar un valor a un atributo privado
        //Firma de un setter: 
        //Tipo de dato void(obligatorio), es decir, no retorna nada
        //Nombre del setter siempre empieza set(asignar, colocar, insertar, etc)
        //Set seguido del nombre del atributo
        //Parametros: Solo tiene 1 parametro por el cual ingresa el valor a asignar al atributo
        //No retorna nada
        public void setNombres(String nombres) {
            this.nombres = nombres;
        }

        public String getApellidos() {
            return apellidos;
        }

        public void setApellidos(String apellidos) {
            this.apellidos = apellidos;
        }

        public TipoDocumento getTipoDocumento() {
            return tipoDocumento;
        }

        public void setTipoDocumento(TipoDocumento tipoDocumento) {
            this.tipoDocumento = tipoDocumento;
        }

        public Long getNumeroDocumento() {
            return numeroDocumento;
        }

        public void setNumeroDocumento(Long numeroDocumento) {
            this.numeroDocumento = numeroDocumento;
        }

        


        



    }
