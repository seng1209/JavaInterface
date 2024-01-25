
import Format.Rectangle;
import Format.Square;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setW(3);
        rectangle.setL(5);
        double area = rectangle.Area();
        System.out.println("Rectangle Area is : "+area);
        double perimeter = rectangle.Perimeter();
        System.out.println("Rectangle Perimeter is : "+perimeter);
        double diagonal = rectangle.Diagonal();
        System.out.println("Rectangle Diagonal is : "+diagonal);

        Square square = new Square();
        square.setSize(5);
        area = square.Area();
        System.out.println("Square Area is : "+area);
        perimeter = square.Perimeter();
        System.out.println("Square Perimeter is : "+perimeter);
        diagonal = square.Diagonal();
        System.out.println("Square Diagonal is : "+diagonal);
    }
}