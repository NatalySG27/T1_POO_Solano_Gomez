/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t1_poo;

import java.time.LocalDate;

/**
 *
 * @author UCF20412
 */
public class Paciente {
    String nombre;
    String ap_paterno;
    String ap_materno;
    String tipo_documento;
    String nro_documento;
    LocalDate fecha_nacimiento;
    String tipo_sangre;
    String alergias;
    String celular;
    String correo;
    int edad;
    String categoria;
    
    public void verDatos() {
        System.out.println("Paciente TipoDoc: " + this.tipo_documento
                + " NroDoc: " + this.nro_documento
                + " Nombre: " + this.nombre
                + " Apellido paterno: " + this.ap_paterno
                + " Apellido materno: " + this.ap_materno
                + " Fecha de nacimiento: " + this.fecha_nacimiento
                + " CEL: " + this.celular
                + " EMAIL: " + this.correo);
    }
}
