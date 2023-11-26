import classes.Circle;
import classes.Rectangle;
import classes.Shape;

public class App {
    public static void main(String[] args) throws Exception {
        Shape shape = new Shape();
        shape.draw();
        double result = shape.calculateArea();
        System.out.println(result);

        Circle circle = new Circle(10);
        circle.draw();
        result = circle.calculateArea();
        System.out.println(result);

        Rectangle rectangle = new Rectangle(5, 7);
        rectangle.draw();
        result = rectangle.calculateArea();
        System.out.println(result);
    }
}
