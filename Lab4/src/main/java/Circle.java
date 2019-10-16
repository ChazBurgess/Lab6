
import java.util.Scanner;

public class Circle {

    private double radius;
    final private double PI = 3.14159;

    public Circle(double rad) {
        radius = rad;
    }

    public Circle() {
        radius = 0.0;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double area() {
        return PI * radius * radius;

    }

    public double diameter() {
        return radius * 2;
    }

    public double circumference() {
        return 2 * PI * radius;
    }

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the radius of the Circle.");
        double radius = keyboard.nextDouble();
        Circle circle = new Circle(radius);
        
        System.out.println(" The area is: " + circle.area() + "\n The diameter is: " + 
                circle.diameter() + "\n The circumference is: " + circle.circumference());
        

    }
}
