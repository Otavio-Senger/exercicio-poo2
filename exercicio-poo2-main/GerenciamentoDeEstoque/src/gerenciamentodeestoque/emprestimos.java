
package gerenciamentodeestoque;

import java.util.ArrayList;
import java.util.List;


public class emprestimos {
    private String data;
    private List<leitores> leitores;

    public emprestimos(String data) {
        this.data = data;
        this.leitores = new ArrayList<>();
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<leitores> getLeitores() {
        return leitores;
    }

    public void setLeitores(List<leitores> usuarios) {
        this.leitores = usuarios;
    }
    public void addLeitores (leitores leitor){
    this.leitores.add(leitor);
    }
    
    public void exibir(){
        System.out.println("Data do empréstimo: " + data);
        for (leitores leitor : leitores){
            leitor.exibir();
        }
    }
    
    
}
