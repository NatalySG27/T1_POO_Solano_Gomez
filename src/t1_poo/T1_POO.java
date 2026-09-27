/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t1_poo;

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
        while(rpta.equals("si"))
        {
        Paciente p = new Paciente();
        while(p.getTipo_documento() == null)
        {
        System.out.println("Ingrese el tipo de documento");
        p.setTipo_documento(sc.nextLine());
        }
        while(p.getNro_documento() == null)
        {
        System.out.println("Ingrese el número de documento");
        p.setNro_documento(sc.nextLine());
        }
        System.out.println("Ingrese el Apellido Paterno");
        p.setAp_paterno(sc.nextLine());
        System.out.println("Ingrese el Apellido Materno");
        p.setAp_materno(sc.nextLine());
        System.out.println("Ingrese el Nombre");
        p.setNombre(sc.nextLine());
        System.out.println("Ingrese el número de celular");
        p.setCelular(sc.nextLine());
        System.out.println("Ingrese el correo electrónico");
        p.setCorreo(sc.nextLine());
        }
    }
}
