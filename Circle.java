public class Circle {
    double radius;
    static double PI = 3.14159;

    public Circle(double radius){
        this.radius = radius;
    }

    double getArea(){
        double area = PI * (radius * radius);
        return area;
    }
}
