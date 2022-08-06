public class Main {
    public static void main(String[] args) throws RuntimeException {
        MagicBox stringBox = new MagicBox(5);

        stringBox.add("One");
        stringBox.add("Two");
        stringBox.add("three");
        stringBox.add("Four");
        //stringBox.add("Five");

        System.out.println(stringBox.pick());
    }
}
