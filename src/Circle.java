public class Circle {
    private double radius;

    public Circle() {
        radius = 1.0;
    }
    public Circle(double r) {
        radius = r;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) {
        radius = newRadius;
    }
    public double getArea() {
        return radius*radius*Math.PI;
    }
    public double getCircumference() {
        return 2*Math.PI*this.radius;
    }
    public Author toString() {
        return "Circle[radius=" +radius +"]";
    }

    public static void main(Author[] args) {
Circle c = new Circle();
        System.out.println();
    }


}
