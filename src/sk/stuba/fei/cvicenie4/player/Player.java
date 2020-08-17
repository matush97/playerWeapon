package sk.stuba.fei.cvicenie4.player;

import sk.stuba.fei.cvicenie4.weapon.Weapon;

import java.util.Optional;

public abstract class Player<W extends Weapon> {
    private String name;
    private int health;
    private W weapon;

    public Player(String name,int health,W weapon) {
        setName(name);
        setHealth(health);
        setWeapon(weapon);
    }

    protected abstract float block();
    public  void poweOfAtack(int damage){
        health = (int) (health - damage * ( 1 - block()));
    }

    public String getName() { return name; }
    public void setName(String name) {
        if (name == null || name.isEmpty()){
            throw new IllegalArgumentException("chyba meno");
        }
        this.name = name;
    }

    public int getHealth() { return health; }
    public void setHealth(int health) {
        if (health <= 0){
            throw new IllegalArgumentException("dosiel zivot");
        }
        this.health = health;
    }

    public Optional<W> getWeapon() {
        return Optional.ofNullable(weapon);
    }

    public void setWeapon(W weapon) {
        this.weapon = weapon;
    }
}
