
package gerenciamentodeestoque;

import java.util.ArrayList;
import java.util.List;


public class pacientes {
    private String nome;
    private List<consultas> consultas;

    public pacientes(String nome) {
        this.nome = nome;
        this.consultas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<consultas> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<consultas> consultas) {
        this.consultas = consultas;
    }
    
    public void addConcultas(consultas consulta){
    this.consultas.add(consulta);
    }
    
}
