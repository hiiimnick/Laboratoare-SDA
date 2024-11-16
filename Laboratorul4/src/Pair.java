public class Pair<T> {
    private T first;
    private T second;

    public Pair(T firstElement, T secondElement) {
        first = firstElement;
        second = secondElement;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public void swap() {
        T temp = first;
        first = second;
        second = temp;
    }

    public static <T extends Comparable<T>> Pair<T> minmax(T[] a) {
        try {
            if (a == null || a.length == 0) throw new IllegalArgumentException("EROARE: Vector gol");
            T min = a[0];
            T max = a[0];
            for (T numar : a) {
                if (numar.compareTo(min) < 0) min = numar;
                if (numar.compareTo(max) > 0) max = numar;
            }
            return new Pair<>(min, max);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

}

