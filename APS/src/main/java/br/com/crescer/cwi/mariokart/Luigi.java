package br.com.crescer.cwi.mariokart;

public class Luigi extends Personagem{
    public Luigi() {
        super("Luigi", 60, 5);
    }

    @Override
    public void atacar(ItemDeAtaque itemEquipado, Personagem alvo) {
        super.atacar(itemEquipado, alvo);
    }
}
