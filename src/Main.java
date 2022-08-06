public class Main {
    public static void main(String[] args) throws RuntimeException {
        MagicBox<String> stringBox = new MagicBox<String>(5);

        stringBox.add("One");
        stringBox.add("Two");
        stringBox.add("three");
        stringBox.add("Four");
        stringBox.add("Five");
        System.out.println(stringBox.pick());

        MagicBox<Integer> intBox = new MagicBox<Integer>(5);
        intBox.add(1);
        intBox.add(2);
        intBox.add(3);
        intBox.add(4);
        //intBox.add(5);
        System.out.println(intBox.pick());


    }
}
