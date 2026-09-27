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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAp_paterno() {
        return ap_paterno;
    }

    public void setAp_paterno(String ap_paterno) {
        this.ap_paterno = ap_paterno;
    }

    public String getAp_materno() {
        return ap_materno;
    }

    public void setAp_materno(String ap_materno) {
        this.ap_materno = ap_materno;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        if(tipo_documento.equalsIgnoreCase("DNI") || tipo_documento.equalsIgnoreCase("Carnet de Extranjeria")){
            this.tipo_documento = tipo_documento;
        }else{
            System.out.println("Tipo de documento no valido");
        }
    }

    public String getNro_documento() {
        return nro_documento;
    }

    public void setNro_documento(String nro_documento) {
        if (this.tipo_documento == null){
            System.out.println("Primero debe ingresar el tipo de documento");
            return;
        }

        if(this.tipo_documento.equalsIgnoreCase("DNI")){
            if(nro_documento.length() == 8){
                this.nro_documento = nro_documento;
            }else{
                System.out.println("El nro de DNI debe tener 8 numeros!!!");
            }
        }else{
            if(this.tipo_documento.equalsIgnoreCase("Carnet de Extranjeria")){
                if(nro_documento.length() == 10){
                    this.nro_documento = nro_documento;
                }else{
                    System.out.println("El nro del carnet debe tener 10 numeros!!!");
                }
            }
        }
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getTipo_sangre() {
        return tipo_sangre;
    }

    public void setTipo_sangre(String tipo_sangre) {
        this.tipo_sangre = tipo_sangre;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad >0 && edad <=100){
        this.edad = edad;
        }else{
        System.out.println("Error edad incorrecta");
        }
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public void categorizarPorEdad(){
        if(this.edad>=0 && this.edad<=10){
        this.categoria="niño";
        }
        else if(this.edad>=11 && this.edad<=17){
        this.categoria="adolescente";
        }
        else if(this.edad>=18){
        this.categoria="adulto";
        }
    }
    
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
