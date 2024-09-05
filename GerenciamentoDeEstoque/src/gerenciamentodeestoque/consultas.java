
package gerenciamentodeestoque;

public class consultas {
    private String tipoConsulta;
    private String data;

    public consultas(String tipoConsulta, String data) {
        this.tipoConsulta = tipoConsulta;
        this.data = data;
    }

    public String getTipoConsulta() {
        return tipoConsulta;
    }

    public void setTipoConsulta(String tipoConsulta) {
        this.tipoConsulta = tipoConsulta;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    
}
