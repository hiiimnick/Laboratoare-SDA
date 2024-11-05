package clase;

class FinalDemo {
    public static void main(String args[]) {
        FinalSample f = new FinalSample();
        System.out.println(f.FILE_OPEN);
        //f.FILE_OPEN = 3; //eroare de complicare
    }
}
class FinalSample{
    final int FILE_NEW = 1;
    final int FILE_OPEN = 2;
    final int FILE_SAVE = 3;
    final int FILE_SAVEAS = 4;
    final int FILE_QUIT = 5;
}