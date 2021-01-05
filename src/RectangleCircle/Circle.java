package RectangleCircle;

public class Circle {

    public double diametre;
    public double radius;

    public Circle() {
        this.diametre = 45.0D;
        this.radius = this.diametre / 2.0D;
    }

    public Circle(double diametre) {
        this.diametre = diametre;
        this.radius = diametre / 2.0D;
    }

    public void PrintArea() {
        System.out.println("your area = " + this.diametre / 2.0D * this.diametre / 2.0D * Math.PI);
    }

    public void PrintLength() {
        System.out.println(" your length = " + this.radius * 2.0D * Math.PI);
    }
}
