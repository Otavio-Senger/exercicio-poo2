
package gerenciamentodeestoque;

import java.util.ArrayList;
import java.util.List;


public class pedidoss {
    private String pedido;
    private List<pratos> prato;
    

    public pedidoss(String pedido) {
        this.pedido = pedido;
        this.prato = new ArrayList<>();
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public List<pratos> getPrato() {
        return prato;
    }

    public void setPrato(List<pratos> prato) {
        this.prato = prato;
    }

    public void addPrato(pratos pratos){
    this.prato.add(pratos);
    }
    public void exibir(){
        System.out.println("Pedido: " + pedido);
        for (pratos prato : prato){
        prato.exibir();
        }
    }
    
    
    
    
}
