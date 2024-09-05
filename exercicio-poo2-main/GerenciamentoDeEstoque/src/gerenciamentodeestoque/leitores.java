
package gerenciamentodeestoque;

import java.util.ArrayList;
import java.util.List;


public class leitores {
    private String nome;
    private List<livros> livros;

    public leitores(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<livros> getLivros() {
        return livros;
    }

    public void setLivros(List<livros> livros) {
        this.livros = livros;
    }
    public void addLivros(livros livro){
    this.livros.add(livro);
    }
    public void exibir(){
        System.out.println("Leitores: " + nome);
        for (livros livro : livros){
            System.out.println(" - " + livro.getTitulo());
        }
    }
    
}
