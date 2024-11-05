package clase;

import java.util.Queue;

public class DynQueue implements IntQueue {
    private int values[];
    private int fata, spate, size;

    public DynQueue(int marimeInitiala) {
        values = new int[marimeInitiala];
        fata = 0;
        spate = -1;
        size = 0;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            builder.append(values[(fata + i) % values.length]).append(" ");
        }
        return builder.toString();
    }

    @Override
    public void queue(int item) {
        if (size == values.length) {
            int[] temp = new int[values.length * 2];
            for (int i = 0; i < size; i++) {
                temp[i] = values[(fata + i) % values.length];
            }
            values = temp;
            fata = 0;
            spate = size - 1;
        }
        spate = (spate + 1) % values.length;
        values[spate] = item;
        size++;
    }

    @Override
    public int dequeue() {
        if (size == 0) {
            System.out.println("Coada este goala.");
            return -1;
        }
        int item = values[fata];
        fata = (fata + 1) % values.length;
        size--;
        return item;
    }

}