package course_3.visitor;

public class Video implements Element{
    private float price, minutes;
    private String name;

    public Video(float price, float minutes, String name) {
        this.price = price;
        this.minutes = minutes;
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public float getMinutes() {
        return minutes;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
