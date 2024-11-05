package clase;

public class TestCoadaStiva {
    public static void main(String[] args) {
        // Test pentru DynStack
        DynStack stack = new DynStack(5);
        int[] stackValues = {2, 5, 3, 7, 6, 1};
        for (int value : stackValues) {
            stack.push(value);
        }
        System.out.println("Stiva: " + stack);

        // Test pentru DynQueue
        DynQueue coada = new DynQueue(5);
        int[] queueValues = {2, 5, 3, 7, 6, 1};
        for (int value : queueValues) {
            coada.queue(value);
        }
        System.out.println("Coada: " + coada);
    }
}
