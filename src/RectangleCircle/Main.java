package RectangleCircle;

public class Main {
    public static void main(String[] args) {
        new Rectangle(12.0D, 13.0D);
        Rectangle var2 = new Rectangle();
        System.out.println(var2.getArea());
        System.out.println(var2.getCircumference());
        Circle circle = new Circle(8.0D);
        circle.PrintLength();
        circle.PrintArea();
        Circle circle2 = new Circle();
        circle2.PrintLength();
        circle2.PrintArea();
    }
}
