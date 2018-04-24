package produtos;

public class Eletrodomestico extends Produto {
    private boolean eh220;

    public Eletrodomestico(int codigo, String descricao, double preco, boolean eh220) {
        super(codigo, descricao, preco);
        this.eh220 = eh220;
    }


}
