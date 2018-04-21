package testes;

import exceptions.ValorInvalidoException;
import funcoes.Divisao;
import funcoes.Multiplicacao;
import funcoes.Soma;
import funcoes.Subtracao;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadorMatematicoTest {

    @Test
    public void testandoCalculadoraSoma() throws ValorInvalidoException {
        Soma soma = new Soma(5,5);

        double obtido = soma.calcular();

        assertEquals(10, obtido);
    }

    @Test
    public void testandoErroDaCalculadoraMultiplicacao() throws ValorInvalidoException{
        Multiplicacao multiplicacao = new Multiplicacao(0,0);

        assertThrows(ValorInvalidoException.class, () -> {multiplicacao.calcular();});
    }

}