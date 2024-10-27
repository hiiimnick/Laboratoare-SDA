public class Vars {
    public static void main(String args[]) {
        int x = 150;
        double y = 2.0;
        float z = 20f;
        byte b = 10;
        short c = 14;
        y = x;
        Double nr = 0.0 / 2.0;
        Integer test = nr.intValue();
        String s = "12";
        Integer NaN = 4/2;
        int a = 100;
        System.out.println(nr.isNaN());
        System.out.println(Integer.compare(x, a));
    }
}
