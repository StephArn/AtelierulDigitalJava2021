package course_3.factory;


public class AmericanPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        switch (type){
            case "Chicken":
                pizza = new ChickenPizza();
                break;
            case "Cheese":
                pizza = new CheesePizza();
                break;
            default:
                pizza = new CheesePizza();
        }

        return pizza;
    }
}
