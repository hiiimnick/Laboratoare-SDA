class Exercitii {
    public static void main(String args[]) {
        Integer[] a = {1, 2, 3, 4, 5};
        int index = Gen.Search(a, 4);
        System.out.println("Indexul lui 4 in vector este: " + index);

        Pair<Integer> pair = new Pair<>(10, 20);
        System.out.println("Inainte de swap: " + pair.getFirst() + ", " + pair.getSecond());
        pair.swap();
        System.out.println("Dupa swap: " + pair.getFirst() + ", " + pair.getSecond());

        Integer[] numere = {3, 5, 1, 4, 2};
        Pair<Integer> result = Pair.minmax(numere);
        if(result != null)
            System.out.println("Min: " + result.getFirst() + ", Max: " + result.getSecond());
    }
}