public class Rectangle extends Shape{
    private double a;
    private double b;
    private double c;
    private double d;

    public Rectangle(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public double getPerimeter() {
        return a + b + c + d;
    }
}
