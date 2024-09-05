
package gerenciamentodeestoque;

import java.util.ArrayList;
import java.util.List;


public class marcas {
    private String nome;
    
    private List<carros> carros;

    public marcas(String nome) {
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
    public void addCarros (carros carro){
    this.carros.add(carro);
    }
   
    public double media(){
    double media = 0;
    for (carros carro : carros){
    media +=carro.getValor();
    }
    return media / carros.size();
    }
    public void exibir(){
        System.out.println("Marca: " + nome);
        for (carros carro : carros){
            System.out.println("Modelo: " + carro.getModelo());
            
        }
        System.out.println("Média: " + media());
    }
    
}
