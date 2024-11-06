public class ConcreteDecoratorCypher extends Decorator {


    public ConcreteDecoratorCypher(Component message) {

        super(message);
    }

    @Override
    public String getText() {

        return " #Зашифровано " + super.getText();
    }
}
