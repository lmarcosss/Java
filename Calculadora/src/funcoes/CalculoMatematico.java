package funcoes;

import exceptions.ValorInvalidoException;

public abstract class CalculoMatematico implements CalculadorMatematico{
    private double valor1;
    private double valor2;

    public CalculoMatematico(double valor1, double valor2){
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    @Override
    public double calcular() throws ValorInvalidoException {
        if(!(valor1 <= 0 && valor2 <= 0)){
            return doCalcular();
        } else {
           throw new ValorInvalidoException("Valor Inserido Invalido!");
        }
    }

    protected abstract double doCalcular();

    protected double getValor1() {
        return valor1;
    }

    protected double getValor2() {
        return valor2;
    }
}
