

//public abstract double getPerimeter()
//деген абстракт методун  Shape деген класска кошунуз.
//Ал методту ишке ашырган 5 мурастоочу класс тузунуз жана методту ишке ашырыныз.


public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2, 5, 3, 4);
        System.out.println("Rectangle : " + rectangle.getPerimeter());

        Shape rhombus = new Rhombus(5);
        System.out.println("Rhombus : " + rhombus.getPerimeter());

        Shape pentagon = new Pentagon(3, 5, 7,4,6);
        System.out.println("Pentagon : " + pentagon.getPerimeter());

        Shape triangle = new Triangle(3, 5, 4);
        System.out.println("Triangle : " + triangle.getPerimeter());

        Shape parallelogram = new Parallelogram(5,8);
        System.out.println("Parallelogram : " + parallelogram.getPerimeter());
    }
}