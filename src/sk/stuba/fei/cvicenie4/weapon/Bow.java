package sk.stuba.fei.cvicenie4.weapon;

public class Bow extends Weapon {
    private float rateOfFire; // rychlost strelby
    private int damage;

    public Bow(float rateOfFire, int damage) {
        setRateOfFire(rateOfFire);
        setDamage(damage);
    }
    @Override
    protected int getAbsoluteDamage() {
        return (int) (rateOfFire * damage);
    }

    private void setRateOfFire(float rateOfFire) {
        if (rateOfFire <= 0) {
            throw new IllegalArgumentException("Invalid rate of fire value");
        }
        this.rateOfFire = rateOfFire;
    }

    private void setDamage(int damage) {
        if (damage <= 0) {
            throw new IllegalArgumentException("Invalid damage value");
        }
        this.damage = damage;
    }
}
