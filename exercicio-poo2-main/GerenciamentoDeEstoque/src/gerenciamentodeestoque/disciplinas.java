
package gerenciamentodeestoque;

import java.util.ArrayList;
import java.util.List;


public class disciplinas {
    private String disciplina;
    private List<estudantes> estudantes;

    public disciplinas(String disciplina) {
        this.disciplina = disciplina;
        this.estudantes = new ArrayList<>();
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public List<estudantes> getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(List<estudantes> estudantes) {
        this.estudantes = estudantes;
    }
    public void addEstudantes(estudantes estudante){
        this.estudantes.add(estudante);
    }
    public double media(){
    double media = 0;
    for (estudantes estudante : estudantes){
    media += estudante.getNota();
    }
    return (double) media / estudantes.size();
    }
    
    public void exibir(){
        System.out.println("Disciplina: " + disciplina);
        for (estudantes estudante : estudantes){
        estudante.exibir();
        }
    }
    
}
