
package gerenciamentodeestoque;

import java.util.ArrayList;
import java.util.List;


public class reservas {
    private String lugar;
    private List<voos> voos;

    public reservas(String lugar) {
        this.lugar = lugar;
        this.voos = new ArrayList<>();
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public List<voos> getVoos() {
        return voos;
    }

    public void setVoos(List<voos> voos) {
        this.voos = voos;
    }
    public void addVoos (voos voo){
    this.voos.add(voo);
    }
    
    
    
            
}
