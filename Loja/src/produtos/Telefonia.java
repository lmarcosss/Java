package produtos;

public class Telefonia extends Produto {
    private boolean ehImportado;

    public Telefonia(int codigo, String descricao, double preco, boolean ehImportado) {
        super(codigo, descricao, preco);
        this.ehImportado = ehImportado;
    }

    @Override
    public double getImposto() {
        return super.getImposto() + (super.getImposto() * 0.5);
    }
}
