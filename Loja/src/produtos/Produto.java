package produtos;

public class Produto {

    private int codigo;
    private String descricao;
    private double preco;

    public Produto(int codigo, String descricao, double preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
    }


    public int getCodigo(){
        return this.codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getImposto(){
        return preco * 0.1;
    }

    public double getMargemLucro(){
        return preco * 0.4;
    }

    public double calcularPrecoConsumidor(){
        return getPreco()+getImposto()+getMargemLucro();
    }


}
