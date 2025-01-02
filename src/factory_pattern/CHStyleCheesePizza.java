package factory_pattern;

public class CHStyleCheesePizza extends Pizza {

    public CHStyleCheesePizza() {
        name = "CH Stlye Cheese Pizza";
        dough = "CH Stlye Cheese Dough";
        sauce = "CH Stlye Cheese Sauce";

        toppings.add("CH Stlye Cheese Topping");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }
}
