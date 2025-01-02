package factory_pattern;

public class NYStylePepperoniPizza extends Pizza {

    public NYStylePepperoniPizza() {
        name = "NY Stlye Pepperoni Pizza";
        dough = "NY Stlye Pepperoni Dough";
        sauce = "NY Stlye Pepperoni Sauce";

        toppings.add("NY Stlye Pepperoni Topping");
    }
}
