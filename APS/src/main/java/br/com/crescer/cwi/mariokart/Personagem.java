package br.com.crescer.cwi.mariokart;

import java.util.Random;

public abstract class Personagem {
    private String nome;
    private int vida;
    private int peso;
    private Item itemEquipado;
    Random random = new Random();
    int bonus = random.nextInt(25);

    public Personagem(String nome, int peso, int vida ) {
        this.nome = nome;
        this.peso = peso;
        this.vida = vida;
    }


    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getPeso() {
        return peso;
    }

    public void equiparItem(Item item) {
        this.itemEquipado = item;
    }

    public void desequiparItem() {
        this.itemEquipado = null;
    }

    public void curar(ItemDeCura item){
        this.vida = this.vida + item.usar();
        this.desequiparItem();
    }

    public void tomarDano(int dano){
        this.vida = this.vida - dano;
    }

    public void atacar(ItemDeAtaque item, Personagem alvo){
        alvo.tomarDano(item.usar() + peso/100 + bonus);
        this.desequiparItem();
    }











}
