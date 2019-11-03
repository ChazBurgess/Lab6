
import java.util.Scanner;

public class LandTract {

    public static void main(String[] args) {

        double length = 0;
        double width = 0;
        double area1 = 0;
        double length2 = 0;
        double width2 = 0;
        double area2 = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the length of the first tract of land: ");
        length = keyboard.nextDouble();
        System.out.print("Enter the width of the first tract of land: ");
        width = keyboard.nextDouble();

        System.out.print("Enter the length of the second tract of land: ");
        length2 = keyboard.nextDouble();
        System.out.print("Enter the width of the second tract of land: ");
        width2 = keyboard.nextDouble();

        area1 = calculateLandArea(length, width);
        area2 = calculateLandArea(length2, width2);
        
        if (area1 == area2){
            System.out.println("The area of the first tract of land is "+ area1 
                    +"\nThe area of the second tract of land is " + area2
                    +"\nThese two are the same size.");
        }else{
            System.out.println("The area of the first tract of land is "+ area1 
                    +"\nThe area of the second tract of land is " + area2
                    +"\nThese two are NOT the same size.");
        }
            
       
    }

    public static double calculateLandArea(double length, double width) {
        double area = length * width;
        return area;
    }
   
}
