
package gerenciamentodeestoque;


public class reservass {
    private String reservadores;

    public reservass(String reservadores) {
        this.reservadores = reservadores;
    }

    public String getReservadores() {
        return reservadores;
    }

    public void setReservadores(String reservadores) {
        this.reservadores = reservadores;
    }
    
    public void exibir(){
        System.out.println("Reserva para: " + reservadores);
    }
}
