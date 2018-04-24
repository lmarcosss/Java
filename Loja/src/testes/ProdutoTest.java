package testes;

import org.junit.jupiter.api.Test;
import produtos.Eletrodomestico;
import produtos.Eletropesado;
import produtos.Produto;
import produtos.Telefonia;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    @Test
    public void testandoArrayList(){
        Produto geladeira = new Eletrodomestico(1, "Geladeira Eletrolux", 1000, false);
        Produto iphone = new Telefonia(2, "Iphone X - 256GB", 2000, true);
        Produto serra = new Eletropesado(3, "Jose Serra Eletrica", 1500);
        List <Produto>  listaDeProdutos = new ArrayList<Produto>();
        listaDeProdutos.add(geladeira);
        listaDeProdutos.add(iphone);
        listaDeProdutos.add(serra);

        for (Produto produto: listaDeProdutos
             ) {
            System.out.println("Descricao: " + produto.getDescricao());
            System.out.println("Preço Final Consumidor: R$ " + produto.calcularPrecoConsumidor());
        }

    }


}