package course_3.decorator;

public abstract class Topping extends Beverage{
    private Beverage mainBevarage;

    public Topping(String description, int cost, Beverage mainBevarage) {
        super(description, cost);
        this.mainBevarage = mainBevarage;
    }

    public int getCost(){
        return super.getCost() + mainBevarage.getCost();
    }

    public String getDescription(){
        return super.getDescription() + " " + mainBevarage.getDescription();
    }
}
