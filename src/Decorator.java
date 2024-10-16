/**
 * Клас Decorator реалізує інтерфейс Component і
 * використовується для обгортання іншого компонента з метою розширення його функціональності.
 */
public class Decorator implements Component {

    /** Поле для збереження компонента, що обгортається */
    Component message;

    /**
     * Конструктор класу Decorator, який приймає компонент для обгортання.
     *
     * @param message компонент, текст якого буде повернений.
     */
    public Decorator(Component message) {

        this.message = message;
    }

    /**
     * Повертає текст обгорнутого компонента.
     *
     * @return рядок з текстом обгорнутого компонента.
     */
    @Override
    public String getText() {

        return message.getText();
    }
}
