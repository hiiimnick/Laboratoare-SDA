package clase;

class Figure implements FigureArea {
    double dim1;
    double dim2;
    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    public double area() {
        System.out.println("Area for Figure is undefined.");
        return 0;
    }
}
class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }
    // override area for rectangle
    public double area() {
        System.out.println("Inside Area for Rectangle.");
        return dim1 * dim2;
    }
}
