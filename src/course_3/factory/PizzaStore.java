package course_3.factory;

public abstract class PizzaStore {
    protected abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);

        pizza.addTopping();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
