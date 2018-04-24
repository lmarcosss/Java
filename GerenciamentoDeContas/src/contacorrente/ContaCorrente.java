package contacorrente;

public abstract class ContaCorrente {
    private int agencia;
    private int numeroDaConta;
    private double saldoDisponivel;

    public ContaCorrente(int agencia, int numeroDaConta, double saldoDisponivel) {
        this.agencia = agencia;
        this.numeroDaConta = numeroDaConta;
        this.saldoDisponivel = saldoDisponivel;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getSaldoDisponivel() {
        return saldoDisponivel;
    }

    public void depositar(double valor){
        this.saldoDisponivel = this.saldoDisponivel + valor;
    }

    public void sacar(double valor){
        this.saldoDisponivel = this.saldoDisponivel - valor;
    }
}
