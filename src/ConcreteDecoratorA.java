/**
 * Клас ConcreteDecoratorA розширює клас Decorator і додає додаткову функціональність до компонента.
 */
public class ConcreteDecoratorA extends Decorator {

    /**
     * Конструктор класу ConcreteDecoratorA, який приймає компонент і додає до його тексту префікс "User:".
     *
     * @param message компонент, що буде декорований.
     */
    public ConcreteDecoratorA(Component message) {

        super(message);
    }

    /**
     * Повертає текст обгорнутого компонента з додаванням префіксу "User: ".
     *
     * @return рядок з текстом, доповненим префіксом.
     */
    @Override
    public String getText() {

        return "User: " + super.getText();
    }
}
