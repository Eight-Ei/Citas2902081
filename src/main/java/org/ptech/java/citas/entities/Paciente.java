package org.ptech.java.citas.entities;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.ptech.java.citas.entities.enums.TipoDocumento;
import org.ptech.java.citas.entities.enums.TipoSangre;

    public class Paciente extends Usuario {
    
        private String email;
        private Long celular;
        private LocalDate fechaNacimiento;
        private Double altura;
        private Double peso;
        private TipoSangre tipoSangre;
        private char factorRH;


        public Paciente(    int id,
                            String nombres, 
                            String apellidos, 
                            TipoDocumento tipoDocumento,
                            Long numeroDocumento,
                            String email,
                            Long celular,
                            LocalDate fechaNacimiento,
                            Double altura, 
                            double i,
                            TipoSangre tipoSangre, 
                            char factorRH) {

            super(id, nombres, apellidos, tipoDocumento, numeroDocumento);

            this.email = email;
            this.celular = celular;
            this.fechaNacimiento = fechaNacimiento;
            this.altura = altura;
            this.peso = i;
            this.tipoSangre = tipoSangre;
            this.factorRH = factorRH;
        }


        public String getEmail() {
            return email;
        }


        public void setEmail(String email) {
            this.email = email;
        }


        public Long getCelular() {
            return celular;
        }


        public void setCelular(Long celular) {
            this.celular = celular;
        }


        public LocalDate getFechaNacimiento() {
            return fechaNacimiento;
        }


        public void setFechaNacimiento(LocalDate fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
        }


        public Double getAltura() {
            return altura;
        }


        public void setAltura(Double altura) {
            this.altura = altura;
        }


        public Double getPeso() {
            return peso;
        }


        public void setPeso(Double peso) {
            this.peso = peso;
        }


        public TipoSangre getTipoSangre() {
            return tipoSangre;
        }


        public void setTipoSangre(TipoSangre tipoSangre) {
            this.tipoSangre = tipoSangre;
        }


        public char getFactorRH() {
            return factorRH;
        }


        public void setFactorRH(char factorRH) {
            this.factorRH = factorRH;
        }


        @Override
        public String toString() {
            return "Paciente [Id= " + super.id + "Nombre= " + super.nombres + "apellidos= " + super.apellidos + 
            "Documento= " + super.tipoDocumento + "NumDocumento= " + super.numeroDocumento + "email= " + email + ", celular= " + celular + ", fechaNacimiento= " + fechaNacimiento
                    + ", altura= " + altura + ", peso= " + peso + ", tipoSangre= " + tipoSangre + ", factorRH= " + factorRH
                    + "]";
        }

        
        
        
    }
