package Task3;

public abstract class Animal {

    private double weight;


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    //Returns the sound of the animal
    public abstract String sound();
}
