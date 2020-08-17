package sk.stuba.fei.cvicenie4.weapon;

public  abstract  class Weapon {
    protected float durability; //zivotnost

    //defaultny konstruktor
    public Weapon() { durability = 1f; }

    protected abstract int getAbsoluteDamage();
}
