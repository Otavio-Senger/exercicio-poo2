
package gerenciamentodeestoque;


public class pratos {
    private String prato;
    private int valor;

    public pratos(String prato, int valor) {
        this.prato = prato;
        this.valor = valor;
    }

    public String getPrato() {
        return prato;
    }

    public void setPrato(String prato) {
        this.prato = prato;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public void exibir(){
        System.out.println("Prato: " + prato + " - valor: " + valor);
    }
    
    
    
}
