package factory_pattern;

public class ChicagoPizzaStore extends PizzaStore{

    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new CHStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new CHStyleVeggiePizza();
        } else if (type.equals("clam")) {
            return new CHStyleClamPizza();
        } else if (type.equals("pepperoni")) {
            return new CHStylePepperoniPizza();
        } else return null;
    }
}
