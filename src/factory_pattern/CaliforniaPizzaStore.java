package factory_pattern;

public class CaliforniaPizzaStore extends PizzaStore{

    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new CAStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new CAStyleVeggiePizza();
        } else if (type.equals("clam")) {
            return new CAStyleClamPizza();
        } else if (type.equals("pepperoni")) {
            return new CAStylePepperoniPizza();
        } else return null;
    }
}
