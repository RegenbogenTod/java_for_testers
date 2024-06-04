public class Geometry {
    public static void main(String[] args) {
        printSquareArea(7.0);
        printSquareArea(5.0);
        printSquareArea(3.0);

        printRectanglrArea (3.0, 5.0);
        printRectanglrArea (7.0, 9.0);
    }

    private static void printRectanglrArea(double a, double b) {
        System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + rectangleArea(a, b));
    }

    private static double rectangleArea(double a, double b) {
return a + b;

    }

    static void printSquareArea(double side) {
        System.out.println("Площадь квадрата со стороной " + side + " = " + SquareArea(side));
    }

    private static double SquareArea(double a) {
        return a * a;
    }
}
