/**
 * Клас ConcreteDecoratorB розширює клас Decorator і додає додаткову функціональність до компонента.
 */
public class ConcreteDecoratorB extends Decorator {

    /**
     * Конструктор класу ConcreteDecoratorB, який приймає компонент
     * і фільтрує його текст, замінюючи небажані слова на символи "***".
     *
     * @param message компонент, що буде декорований.
     */
    public ConcreteDecoratorB(Component message) {
        super(message);
    }

    /**
     * Повертає текст обгорнутого компонента із заміною небажаного слова на "***".
     *
     * @return рядок з відфільтрованим текстом.
     */
    @Override
    public String getText() {

        return super.getText().replaceAll("абц", "***");
    }
}