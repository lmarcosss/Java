package produtos;

public class Eletropesado extends Produto {
    public Eletropesado(int codigo, String descricao, double preco) {
        super(codigo, descricao, preco);
    }

    @Override
    public double getMargemLucro() {
        if(getPreco() > 999.00){
            return super.getMargemLucro() - (super.getMargemLucro() * 0.2);
        } else {
            return super.getMargemLucro();
        }
    }
}
