public class ConcreteDecoratorCompress extends Decorator {

    public ConcreteDecoratorCompress(Component message) {
        super(message);
    }

    @Override
    public String getText() {

        return super.getText().replaceAll(" ", "");
    }
}