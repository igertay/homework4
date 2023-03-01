import java.util.Random;

public class MagicBox<T> {

    protected T[] items;
    protected int number;

    public MagicBox(int number) {
        this.number = number;
        this.items = (T[]) new Object[number];
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
        int cells = 0;
        for (T x : items) {
            if (x == null) {
                cells++;
            }
        }
        if (cells != 0) {
            throw new RuntimeException("Тут ещё как-то пустовато... Заполни ещё " + cells + " ячеек!");
        }
        return items[random()];
    }

    protected int random() {
        Random random = new Random();
        int randomInt = random.nextInt(number);
        return randomInt;
    }

}

