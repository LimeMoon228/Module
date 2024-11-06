public class Main {

    public static void main(String[] args) {

        Component msg = new ConcreteComponent("Це просте повыдемлення");

        Component CypheredMessage = new ConcreteDecoratorCypher(msg);

        Component CompressedCypheredMessage = new ConcreteDecoratorCompress(CypheredMessage);

        Component TimeCompressedCypheredMessage = new ConcreteDecoratorTime(CompressedCypheredMessage);

        Component NameTimeCompressedCypheredMessage = new ConcreteDecoratorName(TimeCompressedCypheredMessage);

        System.out.println(msg.getText());
        System.out.println(CypheredMessage.getText());
        System.out.println(CompressedCypheredMessage.getText());
        System.out.println(TimeCompressedCypheredMessage.getText());
        System.out.println(NameTimeCompressedCypheredMessage.getText());
    }
}