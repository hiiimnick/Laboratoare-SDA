class Gen<T> {
    T ob; // declare an object of type T

    Gen(T o) {
        ob = o;
    }

    // Return ob.
    T getob() {
        return ob;
    }

    public static <T extends Comparable<T>> int Search(T[] a, T key) {
        try {
            for (int i = 0; i < a.length; i++) {
                if (key.compareTo(a[i]) == 0) {
                    return i;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return -1;
        }
        return -1;
    }
}

