package RectangleCircle;

public class Rectangle {
    public double height;
    public double wight;

    public Rectangle() {
        this.wight = 12.0D;
        this.height = 11.0D;
    }

    public Rectangle(double height, double wight) {
        this.wight = wight;
        this.height = height;
    }

    public double getArea() {
        return this.wight * this.height;
    }

    public double getCircumference() {
        return 2.0D * this.wight * 2.0D * this.height;
    }

}
