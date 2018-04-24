package contacorrente;

public class Gold extends ContaCorrente{

    public Gold(int agencia, int numeroDaConta, double saldoDisponivel) {
        super(agencia, numeroDaConta, saldoDisponivel);
    }

    @Override
    public void depositar(double valor) {
        super.depositar(valor * 3);
    }
}
