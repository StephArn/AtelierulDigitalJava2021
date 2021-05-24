package course_3.decorator;

public class Milk extends Topping{
    public Milk(Beverage mainBevarage) {
        super("Milk", 2, mainBevarage);
    }
}
