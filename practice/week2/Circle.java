package practice.week2;
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

/* 
default constructor
-------------------

public Circle(){}

public circle (double radius){
    this.radius = radius
}

public double getArea(){
    return PI * radius * radius;
}

-------------------
       main
------------------
pc main{
    psvms args{
    
    Circle icrlce = new Circle(250);
    double area = circle.getArea();
    SOUT
    }
}
     */
