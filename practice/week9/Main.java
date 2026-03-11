package practice.week9;

public class Main {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        System.out.printf("Area: %-2f", t1.getArea());
        System.out.println("\nPerimeter: " + t1.getPerimeter() + "\n");

        Triangle t2 = new Triangle("white", true, 2.2, 3.5, 6.7);
        System.out.println(t2.toString());
        System.out.printf("Area: %-2f", t2.getArea());
        System.out.println("\nPerimeter: " + t2.getPerimeter() + "\n");

    }
}
