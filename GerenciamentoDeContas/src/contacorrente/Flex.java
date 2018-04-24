package contacorrente;

public class Flex extends ContaCorrente{
    public Flex(int agencia, int numeroDaConta, double saldoDisponivel) {
        super(agencia, numeroDaConta, saldoDisponivel);
    }

    @Override
    public void depositar(double valor) {
        super.depositar(valor * 2);
    }
}
