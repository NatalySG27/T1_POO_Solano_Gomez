/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t1_poo;

import java.util.ArrayList;

/**
 *
 * @author UCF20412
 */
public class PacienteController {
    ArrayList<Paciente> lista_pacientes = new ArrayList();
    
    public void agregarPaciente(Paciente p){
        lista_pacientes.add(p);
    }
    
    public void listarPacientes(){
        System.out.println("La lista de pacientes es:");
        for(Paciente paciente : lista_pacientes){
        paciente.verPaciente();
        }
    }
}
