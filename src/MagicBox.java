import java.util.Random;

public class MagicBox<T> {
    protected int maxItems;
    protected T[] items;

    public MagicBox(int maxItems) {
        this.maxItems = maxItems;
        this.items = (T[]) new Object[maxItems];
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;}
            }
        return false;
    }

    public T pick() throws RuntimeException {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                throw new RuntimeException("Нужно заполнить коробку, осталось ячеек: " + (items.length - i) + " шт.");
            }
        }
        Random random = new Random();
        int randomInt = random.nextInt(maxItems);
        return items[randomInt];
    }
}

