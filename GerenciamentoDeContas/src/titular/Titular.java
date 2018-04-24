package titular;

import contacorrente.ContaCorrente;

public class Titular {
    private String nome;
    private int idade;
    private int cpf;
    private ContaCorrente contaCorrenteVinculada;

    public Titular(String nome, int idade, int cpf, ContaCorrente contaCorrenteVinculada) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.contaCorrenteVinculada = contaCorrenteVinculada;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getCpf() {
        return cpf;
    }

    public ContaCorrente getContaCorrenteVinculada() {
        return contaCorrenteVinculada;
    }
}
