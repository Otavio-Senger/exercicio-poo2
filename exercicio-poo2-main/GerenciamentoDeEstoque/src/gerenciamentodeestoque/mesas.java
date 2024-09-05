
package gerenciamentodeestoque;

import java.util.ArrayList;
import java.util.List;


public class mesas {
    private String mesa;
    private List<pedidoss> pedidos;
    private List<reservass> reserva;

    public mesas(String mesa) {
        this.mesa = mesa;
        this.pedidos = new ArrayList<>();
        this.reserva = new ArrayList<>();
        
    }

    public String getMesa() {
        return mesa;
    }

    public void setMesa(String mesa) {
        this.mesa = mesa;
    }

    public List<pedidoss> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<pedidoss> pedidos) {
        this.pedidos = pedidos;
    }
    public void addPedido(pedidoss pedido){
    this.pedidos.add(pedido);
    }
    public void addReserva(reservass reservas){
    this.reserva.add(reservas);
    }
    public void exibir(){
        System.out.println("mesa: " + mesa);
        
        for (pedidoss pedido : pedidos){
        pedido.exibir();
        }
    }
    
    
}
