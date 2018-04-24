package contacorrente;

public class Simples extends ContaCorrente{

    public Simples(int agencia, int numeroDaConta, double saldoDisponivel) {
        super(agencia, numeroDaConta, saldoDisponivel);
    }

    @Override
    public void depositar(double valor) {
        super.depositar(valor);
    }
}
