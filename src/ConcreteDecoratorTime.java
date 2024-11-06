public class ConcreteDecoratorTime extends Decorator {
    public ConcreteDecoratorTime(Component message) {

        super(message);
    }

    @Override
    public String getText() {

        return "Time: 11:00 " + super.getText();
    }
}
