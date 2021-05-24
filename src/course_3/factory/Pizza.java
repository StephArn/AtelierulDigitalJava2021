package course_3.factory;

public class Pizza {
    private String name;
    private String dough;
    private String topping;

    public Pizza(String name, String dough, String topping) {
        this.name = name;
        this.dough = dough;
        this.topping = topping;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough='" + dough + '\'' +
                ", topping='" + topping + '\'' +
                '}';
    }

    public void addTopping(){
        System.out.println("Adding topping to pizza " + name);
    }

    public void bake(){
        System.out.println("Baking pizza " + name);
    }

    public void cut(){
        System.out.println("Cutting pizza " + name);
    }

    public void box(){
        System.out.println("Boxing pizza " + name);
    }
}
