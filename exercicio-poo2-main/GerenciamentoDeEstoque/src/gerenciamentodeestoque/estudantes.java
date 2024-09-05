
package gerenciamentodeestoque;

public class estudantes {
    private String nome;
    private double nota;

    public estudantes(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    
    public void exibir(){
        System.out.println("Estudante: " + nome + " - Nota: " + nota);
    }
    
}
