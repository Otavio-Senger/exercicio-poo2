
package gerenciamentodeestoque;

import java.util.ArrayList;
import java.util.List;


public class estoqueCarros {
    private List<carros> carros;

    public estoqueCarros() {
    this.carros = new ArrayList<>();
    }

    public List<carros> getCarros() {
        return carros;
    }

    public void setCarros(List<carros> carros) {
        this.carros = carros;
    }
    
    
    public void addCarros(carros carro){
    this.carros.add(carro);
    }
    
    public void exibir(){
        
        for(carros carro : carros){
            System.out.println("Modelo: " + carro.getModelo());
            System.out.println("Valor: " + carro.getValor());
        }
    }
}
