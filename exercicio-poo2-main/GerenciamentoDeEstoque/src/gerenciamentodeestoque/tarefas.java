
package gerenciamentodeestoque;


public class tarefas {
    private String tarefa;
    private int tempo;

    public tarefas(String tarefa, int tempo) {
        this.tarefa = tarefa;
        this.tempo = tempo;
    }

    public String getTarefa() {
        return tarefa;
    }

    public void setTarefa(String tarefa) {
        this.tarefa = tarefa;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }
    
    
    
}
