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
    private String nombre;
    private String ap_paterno;
    private String ap_materno;
    private String tipo_documento;
    private String nro_documento;
    private LocalDate fecha_nacimiento;
    private String tipo_sangre;
    private String alergias;
    private String celular;
    private String correo;
    private int edad;
    private String categoria;
    
    public void verDatos() {
        System.out.println("Paciente TipoDoc: " + this.tipo_documento
                + " NroDoc: " + this.nro_documento
                + " Nombre: " + this.nombre
                + " Apellido paterno: " + this.ap_paterno
                + " Apellido materno: " + this.ap_materno
                + " Fecha de nacimiento: " + this.fecha_nacimiento
                + " CEL: " + this.celular
                + " EMAIL: " + this.correo
                + " Edad: " + this.edad
                + " Categoria: " + this.categoria);
    }
}
