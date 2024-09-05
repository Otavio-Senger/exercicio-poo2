
package gerenciamentodeestoque;


public class projetos {
    private String nome;
    private String funcionario;

    public projetos(String nome, String funcionario) {
        this.nome = nome;
        this.funcionario = funcionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }
    
    
}
