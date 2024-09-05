
package gerenciamentodeestoque;

import java.util.ArrayList;
import java.util.List;


public class funcionarios {
    private String nome;
    private String departamento;
    private double salario;
    private List<projetos> projetos;

    public funcionarios(String nome, String departamento, double salario, String projetos) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.projetos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public List<projetos> getProjetos() {
        return projetos;
    }

    public void setProjetos(List<projetos> projetos) {
        this.projetos = projetos;
    }

    public void addProjetos(projetos projeto){
    this.projetos.add(projeto);
    }   
    public void exibirProjetos() {
        System.out.println("Projetos de " + nome + ":");
        for (projetos projeto : projetos) {
            System.out.println("- " + projeto.getNome());
        }
    }
    
    
}
