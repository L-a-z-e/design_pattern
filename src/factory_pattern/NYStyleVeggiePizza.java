package factory_pattern;

public class NYStyleVeggiePizza extends Pizza {

    public NYStyleVeggiePizza() {
        name = "NY Stlye Veggie Pizza";
        dough = "NY Stlye Veggie Dough";
        sauce = "NY Stlye Veggie Sauce";

        toppings.add("NY Stlye Veggie Topping");
    }
}
