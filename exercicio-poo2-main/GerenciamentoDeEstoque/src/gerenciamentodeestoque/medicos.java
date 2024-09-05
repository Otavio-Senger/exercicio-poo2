
package gerenciamentodeestoque;

import java.util.ArrayList;
import java.util.List;


public class medicos {
    private String nome;
    private List<pacientes> pacientes;

    public medicos(String nome) {
        this.nome = nome;
        this.pacientes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<pacientes> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<pacientes> pacientes) {
        this.pacientes = pacientes;
    }
    
    public void addPacientes(pacientes paciente){
    this.pacientes.add(paciente);
    }
    
    public void exibir(){
        System.out.println("Médico: " + nome);
        for (pacientes paciente : pacientes){
            System.out.println("Paciente: " + paciente.getNome());
            for (consultas consulta : paciente.getConsultas()){
                System.out.println("Consulta: " + consulta.getTipoConsulta() + " - " + consulta.getData());
            }
        }
    }
    
}
