import java.util.Arrays;
import java.util.Random;

public class MagicBox<T> {

    private final int maxCapacity;
    private final T[] items;
    private final Random random = new Random();
    private int counter = 0;

    @SuppressWarnings("unchecked")
    public MagicBox(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        items = (T[]) new Object[maxCapacity];
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                counter++;
                return true;
            }
        }
        return false;
    }

    public T pick() {
        int countEmptyCells = maxCapacity - counter;
        if (countEmptyCells != 0) {
            throw new RuntimeException("The box isn't full. " + countEmptyCells + " cell(s) are empty");
        } else {
            int randomInt = random.nextInt(maxCapacity);
            return items[randomInt];
        }

    }

    public void print() {
        System.out.println(Arrays.toString(items));
    }

}


