package clase;

public class DynStack implements IntStack {

    private int values[];
    private int top;

    public DynStack(int marimeInitiala) {
        values = new int[marimeInitiala];
        top = -1;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        for(int i = top; i>=0; i--) {
            builder.append(values[i]).append(" ");
        }
        return builder.toString();
    }

    @Override
    public void push(int value) {
        if(top == values.length - 1) {
            int[] temp = new int[values.length * 2];
            System.arraycopy(values, 0, temp, 0, values.length);
            values = temp;
        }
        values[++top] = value;
    }

    @Override
    public int pop() {
        if(top < 0) {
            System.out.println("Stiva este goala");
            return 0;
        }
        return values[top--];
    }

}
