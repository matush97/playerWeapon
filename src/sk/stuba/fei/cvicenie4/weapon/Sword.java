package sk.stuba.fei.cvicenie4.weapon;

public class Sword extends Weapon {
    private int weight;
    private  int lenght;

    @Override
    protected int getAbsoluteDamage() {
        return weight*lenght;
    }


    public Sword(int weight, int lenght) {
        setWeight(weight);
        setLenght(lenght);
    }

    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        if (weight <=0){
            throw new IllegalArgumentException("zla hodnota vahy");
        }
        this.weight = weight;
    }

    public int getLenght() {
        return lenght;
    }
    public void setLenght(int lenght) {
        if (lenght<=0){
            throw new IllegalArgumentException("zla hodnota dlzky");
        }
        this.lenght = lenght;
    }
}
