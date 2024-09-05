
package gerenciamentodeestoque;

import java.util.ArrayList;
import java.util.List;


public class desenvolvedores {
    private String nome;
    private List<tarefas> tarefas;

    public desenvolvedores(String nome) {
        this.nome = nome;
        this.tarefas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<tarefas> getTarefas() {
        return tarefas;
    }

    public void setTarefas(List<tarefas> tarefas) {
        this.tarefas = tarefas;
    }
    public void addTarefas(tarefas tarefa){
    this.tarefas.add(tarefa);
    }
    
    public void exibir(){
        System.out.println("Tarefas: " + nome + ": ");
        for (tarefas tarefa : tarefas){
            System.out.println("- " + tarefa.getTarefa() + " - tempo estimado: " + tarefa.getTempo() + "h");
        }
        
    }
    
    
    
    
}
