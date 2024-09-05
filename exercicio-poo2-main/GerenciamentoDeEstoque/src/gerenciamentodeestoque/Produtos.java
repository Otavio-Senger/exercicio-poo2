package gerenciamentodeestoque;

import java.util.Scanner;

public class Produtos {

    Scanner sc = new Scanner(System.in);

    private String nome;
    private String numero;
    private int estoque;

    public Produtos(String nome, String numero, int estoque) {
        this.nome = nome;
        this.numero = numero;
        this.estoque = estoque;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public String getFinais() {
        return "Produto: " + this.nome;
    }

}
