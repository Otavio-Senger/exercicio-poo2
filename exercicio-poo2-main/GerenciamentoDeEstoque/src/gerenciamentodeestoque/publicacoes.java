
package gerenciamentodeestoque;

import java.util.ArrayList;
import java.util.List;


public class publicacoes {
    private String contexto;
    private List<comentarios> comentarios;

    public publicacoes(String contexto) {
        this.contexto = contexto;
        this.comentarios = new ArrayList<>();
    }

    public String getContexto() {
        return contexto;
    }

    public void setContexto(String contexto) {
        this.contexto = contexto;
    }

    public List<comentarios> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<comentarios> comentarios) {
        this.comentarios = comentarios;
    }
    public void addComentarios(comentarios comentario){
    this.comentarios.add(comentario);
    }
    
    
    
}
