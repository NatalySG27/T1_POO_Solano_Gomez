/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t1_poo;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/**
 *
 * @author UCF20412
 */
public class T1_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        PacienteController controla = new PacienteController();
        String rpta="si";
        System.out.println("SISTEMA DE REGISTRO DE PACIENTES");
        
        while(rpta.equalsIgnoreCase("si")) {
            registrarPersona(sc, controla);
            System.out.println("¿Desea ingresar otro paciente? (si/no):");
            rpta = sc.nextLine();
        }
        
        mostrarListado(controla);
        realizarBusqueda(sc, controla);
        sc.close();
    }
    
    public static void registrarPersona(Scanner sc, PacienteController controla) {
        Paciente p1 = new Paciente();
        
        while(p1.getTipo_documento() == null){
            System.out.println("Ingrese tipo de documento (DNI / Carnet de Extranjeria): ");
            p1.setTipo_documento(sc.nextLine());
        }
        
        while(p1.getNro_documento() == null){
            System.out.println("Ingrese nro de documento: ");
            p1.setNro_documento(sc.nextLine());
        }
        
        System.out.println("Ingrese nombre: ");
        p1.setNombre(sc.nextLine());
        
        System.out.println("Ingrese apellido paterno: ");
        p1.setAp_paterno(sc.nextLine());
        
        System.out.println("Ingrese apellido materno: ");
        p1.setAp_materno(sc.nextLine());
        
        while(p1.getCelular()== null){
            System.out.println("Ingrese nro de celular: ");
            p1.setCelular(sc.nextLine());
        }
        
        boolean correoValido = false;
        while(!correoValido){
            try {
                System.out.println("Ingrese correo electronico (Formato abcd@gmail.com): ");
                p1.setCorreo(sc.nextLine());
                correoValido = true;
            } catch(Exception e){
                System.out.println("ERROR: Formato de correo electronico no valido. Use el formato abcd@gmail.com");
            }
        }
        
        boolean fechaValida = false;
        while(!fechaValida){
            try {
                System.out.println("Ingrese fecha de nacimiento (Formato AAAA-MM-DD): ");
                p1.setFecha_nacimiento(LocalDate.parse(sc.nextLine()));
                fechaValida = true;
            } catch(DateTimeParseException e){
                System.out.println("ERROR: Formato de fecha no valido. Use el formato AAAA-MM-DD");
            }
        }
        
        System.out.println("Ingrese sus alergias: Si es mas de 1 separar por comas (,)");
        p1.setAlergias(sc.nextLine());
        
        while(p1.getEdad() == 0){
            System.out.println("Ingrese la edad");
            p1.setEdad(sc.nextInt());
        }
        sc.nextLine(); 
        controla.agregarPaciente(p1);
    }
    
    public static void mostrarListado(PacienteController controla) {
        System.out.println("\n----------------------------------------");
        controla.listarPacientes();
    }
    
    public static void realizarBusqueda(Scanner sc, PacienteController controla) {
        System.out.println("\n----------------------------------------");
        try {
            System.out.println("Ingrese el numero de documento que desea buscar: ");
            controla.buscarPaciente(sc.nextLine());
        } catch(Exception e){
            System.out.println("ERROR: Ocurrio un problema en la busqueda.");
        }
    }
}
