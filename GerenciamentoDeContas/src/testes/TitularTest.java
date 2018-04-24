package testes;

import contacorrente.ContaCorrente;
import contacorrente.Flex;
import contacorrente.Gold;
import org.junit.jupiter.api.Test;
import titular.Titular;

import static org.junit.jupiter.api.Assertions.*;

class TitularTest {

    @Test
    public void testeDoTitular(){
        ContaCorrente contaFlex = new Flex(123, 12354, 100);
        Titular titular = new Titular("Fulaninho", 50, 35246215, contaFlex);
        titular.getContaCorrenteVinculada().depositar(100);
        double obtido = titular.getContaCorrenteVinculada().getSaldoDisponivel();
        assertEquals(300, obtido);
        titular.getContaCorrenteVinculada().sacar(200);
        assertEquals(100, titular.getContaCorrenteVinculada().getSaldoDisponivel());
    }

}