
package gerenciamentodeestoque;

import java.util.ArrayList;
import java.util.List;


public class departamentos {
    private String nome;
    private List<funcionarios> funcionarios;

    public departamentos(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<funcionarios> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<funcionarios> funcionarios) {
        this.funcionarios = funcionarios;
    }
    
    public void addFuncionario(funcionarios Funcionario){
    this.funcionarios.add(Funcionario);
    }
    
    public double mediaSalarial(){
        double somaSalarios = 0;
        for (funcionarios funcionario : funcionarios) {
            somaSalarios += funcionario.getSalario();
    }
        return funcionarios.size() > 0 ? somaSalarios / funcionarios.size() : 0;
    }
    
}
