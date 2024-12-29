package strategy_pattern;

public class Beep implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Beep!");
    }
}
