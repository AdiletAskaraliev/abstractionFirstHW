public class Pentagon extends Shape{
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;

    public Pentagon(double a, double b, double c, double d, double e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }

    @Override
    public double getPerimeter() {
        return a + b + c + d + e;
    }
}
