package clase;

class OverloadCons {
    public static void main(String args[]) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);
        double vol;
// get volume of first box
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);
        //Box mybox1 = new Box(10, 20, 15);
        //Box mybox2 = new Box();
        //Box mycube = new Box(7);
        Box myclone = mybox1; // create copy of mybox1
        //double vol;
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);
        System.out.println("Volume of clone is " + vol);
    }
}