package Task3;

public class Chicken extends Animal implements Edible{


    @Override
    public String sound() {
        return "Bok... bok bok...";
    }

    @Override
    public String howToEat() {
        return "Cook and bite";
    }
}
