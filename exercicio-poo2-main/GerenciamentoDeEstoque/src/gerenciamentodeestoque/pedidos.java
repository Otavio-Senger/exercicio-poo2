
package gerenciamentodeestoque;

public class pedidos {
    private String produto;
    private String numero;
    private int quatntidade;
    

    public pedidos(String produto, String numero, int quatntidade) {
        this.produto = produto;
        this.numero = numero;
        this.quatntidade = quatntidade;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getQuatntidade() {
        return quatntidade;
    }

    public void setQuatntidade(int quatntidade) {
        this.quatntidade = quatntidade;
    }
    public String getFinal(){
        return "Produto: " + this.produto + ", Quantidade: " + this.quatntidade;
    }
    
    
}
