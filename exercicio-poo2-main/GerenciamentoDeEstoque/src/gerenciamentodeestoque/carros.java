
package gerenciamentodeestoque;

import java.util.ArrayList;
import java.util.List;


public class carros {
    private String modelo;
    private double valor;
    

    public carros(String modelo, double valor) {
        this.modelo = modelo;
        this.valor = valor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    

    
    
}
