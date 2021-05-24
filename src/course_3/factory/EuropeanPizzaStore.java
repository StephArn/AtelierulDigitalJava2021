package course_3.factory;

public class EuropeanPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        switch (type){
            case "Marguerita":
                pizza = new MargueritaPizza();
                break;
            case "Diavola":
                pizza = new DiavolaPizza();
                break;
            default:
                pizza = new MargueritaPizza();
        }

        return pizza;
    }
}
