
package gerenciamentodeestoque;

import java.util.ArrayList;
import java.util.List;


public class vendedores {
    private String nome;
    private List<carros> carros;

    public vendedores(String nome) {
        this.nome = nome;
        this.carros = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
        System.out.println("Vendedor: " + nome);
        for (carros carro: carros){
            System.out.println("Carro: " + carro.getModelo() + " - " + "Preço: " + carro.getValor() );
        }
    }
    
}
