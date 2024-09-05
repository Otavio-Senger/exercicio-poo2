
package gerenciamentodeestoque;

public class voos {
 private String numeroVoo;
 private String disponibilidade;

    public voos(String numeroVoo, String disponibilidade) {
        this.numeroVoo = numeroVoo;
        this.disponibilidade = disponibilidade;
    }

    public String getNumeroVoo() {
        return numeroVoo;
    }

    public void setNumeroVoo(String numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
 
 
 
}
