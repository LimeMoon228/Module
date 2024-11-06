public class ConcreteDecoratorName extends Decorator{

    public ConcreteDecoratorName(Component message) {

        super(message);
    }

    @Override
    public String getText() {

        return super.getText()+" Автор: Володенков Володимир";
    }

}
