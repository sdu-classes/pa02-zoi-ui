import java.util.*;
import java.util.stream.Stream;

public class pra2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
      
        Circle circle = new Circle(5.5 , "red" , false);
        System.out.println(circle);
        System.out.printf("%.2f" , circle.getArea() );
        System.out.println();
        System.out.printf("%.2f" , circle.getPerimeter());
        System.out.println();
        System.out.println(circle.getColor());
        System.out.println(circle.isFilled());
        System.out.println(circle.getRadius());

      
        Rectangle rectangle = new Rectangle(3.8 , 2.5 , "green" , false);
        System.out.println(rectangle);
        System.out.printf( "%.2f", rectangle.getArea() );
        System.out.println();
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getColor());
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());


        Square square = new Square(6.6  , "black" , true );
        System.out.println(square);
        System.out.printf( "%.2f" , square.getArea());
        System.out.println();
        System.out.println(square.getColor());
        System.out.println(square.getSide());

    }
}

class Shape{
    private String color = "red";
    private boolean filled = true;
    Shape(){}
    Shape(String color , boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}

class Circle extends Shape{
    private double radius ;

    public Circle() {
        super();
        this.radius = 1.0;
    }
    Circle(double radius){
        super();
        this.radius = radius;
    }

    public Circle(   double radius , String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    double getArea(){
        return Math.PI * Math.pow(radius , 2);
    }
    double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle [" + super.toString() + "], radius = " + radius + "]";
    }
}
class Rectangle extends Shape {
    private double width;
    private double length;

    Rectangle() {
        super();
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    double getArea() {
        return width * length;
    }

    double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle[ " + super.toString() +
                " ] width=" + width +
                ", length=" + length +
                ']';
    }
}

class Square extends Rectangle{
    Square(){
        super();
    }
    Square(double side){
        super(side , side);

    }

    Square(double side , String color , boolean filled){
        super(side ,side ,  color , filled);
    }
   double getSide(){
        return getWidth();
   }
   public void setWidth(double width){
        super.setWidth(width);
        super.setLength(width);
   }
   public void setLength(double length){
        super.setWidth(length);
        super.setLength(length);
   }


    public String toString() {
        return "Square[" + super.toString() ;
    }
}
