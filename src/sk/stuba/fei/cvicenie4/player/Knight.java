package sk.stuba.fei.cvicenie4.player;

import sk.stuba.fei.cvicenie4.weapon.Sword;

public class Knight extends Player<Sword>{


    public Knight(String name, int health, Sword sword) { //parametricky konstruktor
        super(name,health,sword);
    }

    @Override
    protected float block() {
        return 0.2f;
    }

    @Override
    public String toString() {
        return "Knight{" +
                "meno " + getName() +
                ", health " + getHealth() +
                '}';
    }


}
