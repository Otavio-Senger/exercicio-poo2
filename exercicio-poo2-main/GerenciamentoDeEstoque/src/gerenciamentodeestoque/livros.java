
package gerenciamentodeestoque;


public class livros {
   private String titulo;
   private int popularidade;

    public livros(String titulo, int popularidade) {
        this.titulo = titulo;
        this.popularidade = popularidade;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPopularidade() {
        return popularidade;
    }

    public void setPopularidade(int popularidade) {
        this.popularidade = popularidade;
    }
    
   
   
}
