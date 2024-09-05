package gerenciamentodeestoque;

import java.util.ArrayList;
import java.util.List;

public class usuarios {

    private String nome;
    private List<publicacoes> publicacoes;

    public usuarios(String nome) {
        this.nome = nome;
        this.publicacoes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<publicacoes> getPublicacoes() {
        return publicacoes;
    }

    public void setPublicacoes(List<publicacoes> publicacoes) {
        this.publicacoes = publicacoes;
    }

    public void addPublicacao(publicacoes publicacao) {
        this.publicacoes.add(publicacao);
    }

    public void exibir() {
        System.out.println("Nome: " + nome);
        for (publicacoes publicacao : publicacoes) {
            System.out.println("publicação: " + publicacao.getContexto());
            for (comentarios comentario : publicacao.getComentarios()) {
                System.out.println("comentários: " + comentario.getComentario());

            }
        }
    }
}
