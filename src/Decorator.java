public class Decorator implements Component {

    Component message;

    public Decorator(Component message) {

        this.message = message;
    }

    @Override
    public String getText() {

        return message.getText();
    }
}
