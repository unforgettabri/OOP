public class MyRectangle2D {

    double x;
    double y;
    double width;
    double height;

    // setters then getters
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // constructor
    public MyRectangle2D() {
        this.x = 0;
        this.y = 0;
        this.width = 1;
        this.width = 1;
    }

    // constructor(specified)
    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    // get the aea method
    public double getArea() {
        return width * height;
    }

    // get perimeter method
    public double getPerimeter() {
        return 2 * (width + height);
    }

    public boolean contains(MyRectangle2D r) {
        // return true if the specified rectangle is inside this rectangle
        if ((r.x + r.width < this.x + this.width) && (r.x > this.x) && (r.y + r.height < this.y + this.height)
                && (r.y > this.y)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean overlaps(MyRectangle2D r) {
        // di ko na ammo aramidek
        return true;
    }
}