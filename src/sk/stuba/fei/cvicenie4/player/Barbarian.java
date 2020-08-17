package sk.stuba.fei.cvicenie4.player;

import sk.stuba.fei.cvicenie4.weapon.Axe;

public class Barbarian extends Player<Axe> {


    public Barbarian(String name, int health, Axe axe) { //parametricky konstruktor
        super(name,health,axe);
    }

    @Override
    protected float block() {
        return (float) (0.1 + Math.random() * (0.2 - 0.1));
    }

    @Override
    public String toString() {
        return "Barbarian{" +
                "meno " + getName() +
                ", health " + getHealth() +
                '}';
    }
}
