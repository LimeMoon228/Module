/**
 * Головний клас програми, що демонструє роботу з декораторами.
 * У цьому прикладі створюється текстовий компонент, який потім форматують і фільтрують за допомогою декораторів.
 */
public class Main {

    /**
     * Точка входу в програму.
     * Створюється текстовий компонент, що обгортається двома декораторами:
     * перший додає форматування, другий виконує фільтрацію тексту.
     */
    public static void main(String[] args) {

        // Створюємо базовий компонент з текстом
        Component msg = new ConcreteComponent("Плохое слово это абц");

        // Обгортаємо компонент у декоратор, який додає префікс "User: "
        Component formattedMessage = new ConcreteDecoratorA(msg);

        // Обгортаємо вже відформатований компонент у декоратор, що фільтрує текст
        Component filteredAndFormattedMessage = new ConcreteDecoratorB(formattedMessage);

        // Виводимо відформатований і відфільтрований текст
        System.out.println(filteredAndFormattedMessage.getText());
    }
}