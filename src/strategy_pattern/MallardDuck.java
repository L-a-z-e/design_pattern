package strategy_pattern;

public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("I'm a mallard duck");
    }
}
