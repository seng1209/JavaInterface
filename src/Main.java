<<<<<<< HEAD
public class Main {
    public static void main(String[] args) {
        System.out.println("Interface!");
=======
import Format.Rectangle;

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
>>>>>>> 1a7c27b (Initial commit)
    }
}