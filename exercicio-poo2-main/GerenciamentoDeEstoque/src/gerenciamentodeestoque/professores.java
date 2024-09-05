
package gerenciamentodeestoque;

import java.util.ArrayList;
import java.util.List;


public class professores {
    private String nome;
    private List<disciplinas> disciplinas;

    public professores(String nome) {
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<disciplinas> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<disciplinas> disciplinas) {
        this.disciplinas = disciplinas;
    }
    public void addDisciplinas (disciplinas disciplina){
    this.disciplinas.add(disciplina);
    }
    
    public void exibir(){
        System.out.println("Professor: " + nome);
        
        for (disciplinas disciplina : disciplinas){
        disciplina.exibir();
        }
    }
    
    
}
