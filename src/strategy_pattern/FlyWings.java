package strategy_pattern;

public class FlyWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("fly wings");
    }
}
