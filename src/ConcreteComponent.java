/**
 * Клас ConcreteComponent реалізує інтерфейс Component.
 * Цей клас представляє конкретний компонент, який містить та повертає текстовий контент.
 */
public class ConcreteComponent implements Component {

    /** Поле для збереження текстового контенту */
    String text;

    /**
     * Конструктор класу ConcreteComponent, який приймає текст.
     *
     * @param text текстовий контент компонента.
     */
    public ConcreteComponent(String text) {

        this.text = text;
    }

    /**
     * Повертає текстовий контент компонента.
     *
     * @return рядок з текстом.
     */
    @Override
    public String getText() {

        return text;
    }
}
