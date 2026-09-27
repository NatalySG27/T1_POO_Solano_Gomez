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
        System.out.println("La lista de pacientes es: ");
        for(int i = 0; i < lista_pacientes.size(); i++){
            Paciente aux = lista_pacientes.get(i);
            aux.verPaciente();
        }
    }

    public void buscarPaciente(String nrobuscado){
        for(int i = 0; i < lista_pacientes.size(); i++){
            if(nrobuscado.equals(lista_pacientes.get(i).getNro_documento())){
                System.out.println("Paciente encontrado y es: ");
                lista_pacientes.get(i).verPaciente();
                return;
            }
        }
        System.out.println("Paciente no encontrado");
    }
}
