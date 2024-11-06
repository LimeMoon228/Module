public class ConcreteComponent implements Component {

    String text;

    public ConcreteComponent(String text) {

        this.text = text;
    }

    @Override
    public String getText() {

        return text;
    }
}
