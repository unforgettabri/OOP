public class Main {
    public static void main(String[] args) {
        MyRectangle2D r = new MyRectangle2D(2, 2, 3, 5.5);
        MyRectangle2D r1 = new MyRectangle2D(3, 3, 2, 1);
        MyRectangle2D r2 = new MyRectangle2D(0, 0, 2, 6);

        System.out.println("Area of r: " + r.getArea());
        System.out.println("Perimeter of r: " + r.getPerimeter());

        System.out.println("r contains r1: " + r.contains(r1));
        System.out.println("r overlaps r2: " + r.overlaps(r2));
    }
}
