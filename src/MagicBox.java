import java.util.Random;

public class MagicBox<T> {
    protected int maxItems;
    protected T[] items;
    protected Random random;

    public MagicBox(int maxItems) {
        this.maxItems = maxItems;
        this.items = (T[]) new Object[maxItems];
        this.random = new Random();
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    public T pick() throws RuntimeException {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                throw new RuntimeException("Нужно заполнить коробку, осталось ячеек: " + (items.length - i) + " шт.");
            }
        }
        int randomInt = random.nextInt(maxItems);
        return items[randomInt];
    }
}

