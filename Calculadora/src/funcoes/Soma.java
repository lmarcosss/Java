package funcoes;

import exceptions.ValorInvalidoException;

public class Soma extends CalculoMatematico{

    public Soma(double valor1, double valor2) {
        super(valor1, valor2);
    }

    @Override
    protected double doCalcular() {
        return getValor1() + getValor2();
    }
}
