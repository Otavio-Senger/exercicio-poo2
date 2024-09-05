
package gerenciamentodeestoque;

import java.util.ArrayList;
import java.util.List;

public class passageiros {
    private String nome;
    private List<reservas> reservas;

    public passageiros(String nome) {
        this.nome = nome;
        this.reservas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<reservas> getReservas() {
        return reservas;
    }

    public void setReservas(List<reservas> reservas) {
        this.reservas = reservas;
    }
    public void addReservas (reservas reserva){
        this.reservas.add(reserva);
    }
    
    public void exibir (){
        System.out.println("Passageiro: " + nome);
        for (reservas reserva : reservas) {
            System.out.println("Reserva: " + reserva.getLugar());
        for (voos voo : reserva.getVoos()){
            System.out.println("Voo: " + voo.getNumeroVoo() + " - " + voo.getDisponibilidade());
        }
        }
    }
    
}
