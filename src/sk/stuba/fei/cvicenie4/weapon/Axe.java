package sk.stuba.fei.cvicenie4.weapon;

public class Axe extends Weapon {
    private int weight;
    private float maneuverability;
    @Override
    protected int getAbsoluteDamage() {
        return (int) (weight* maneuverability);
    }

    public Axe(int weight, float maneuverability) {
        setWeight(weight);
        setManeuverability(maneuverability);
    }

    public int getWeight() { return weight; }
    public void setWeight(int weight) {
        if (weight <=0){
            throw new IllegalArgumentException("zla hodnota vahy");
        }
        this.weight = weight;
    }

    public float getManeuverability() { return maneuverability; }
    public void setManeuverability(float maneuverability) {
        if (maneuverability <=0){
            throw new IllegalArgumentException("zla hodnota maneuverability");
        }
        this.maneuverability = maneuverability;
    }
}
