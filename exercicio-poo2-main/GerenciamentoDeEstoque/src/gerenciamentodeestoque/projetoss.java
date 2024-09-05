
package gerenciamentodeestoque;

import java.util.ArrayList;
import java.util.List;


public class projetoss {
    private String nome;
    private List<tarefas> tarefas;

    public projetoss(String nome) {
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
    
    public int cargaTrabalho(){
    int carga = 0;
    for (tarefas tarefa : tarefas){
    carga += tarefa.getTempo();
    }
    return carga;
    }
    
    
}
