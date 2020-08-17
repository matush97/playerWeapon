package sk.stuba.fei.cvicenie4.player;

import sk.stuba.fei.cvicenie4.weapon.Bow;

public class Ranger  extends Player<Bow>{

    public Ranger(String name, int health, Bow bow) { //parametricky konstruktor
        super(name,health,bow);
    }

    @Override
    protected float block() {
        return 0;
    }

    @Override
    public String toString() {
        return "Ranger{" +
                "meno " + getName() +
                ", health " + getHealth() +
                '}';
    }
}
