
import java.util.Scanner;

public class PaintJobEstimator {

    public static void main(String[] args) {
        final double CHARGE_PER_HOUR = 18.00;
        int numberOfRooms = rooms();
        double totalWallSpace = getTotalWallSpace(numberOfRooms);
        double priceOfPaint = getPaintPrice();
        double gallonsOfPaint = calculateGallonsOfPaint(totalWallSpace);
        double hoursOfLabor = calculateHoursOfLabor(totalWallSpace);
        double costOfPaint = calculateCostOfPaint(priceOfPaint, gallonsOfPaint);
        double laborCharges = cacluateLaborCharges(hoursOfLabor, CHARGE_PER_HOUR);
        double totalCost = totalCost(laborCharges, costOfPaint);
        displayData(gallonsOfPaint, costOfPaint, hoursOfLabor,laborCharges,totalCost);
        
    }

    public static int rooms() {
        int numberOfRooms;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many rooms are being painted?");
        numberOfRooms = keyboard.nextInt();
        return numberOfRooms;
    }

    public static double getPaintPrice() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the price per gallon of paint?");
        double priceOfPaint;
        priceOfPaint = keyboard.nextDouble();
        return priceOfPaint;
    }

    public static double getTotalWallSpace(int numberOfRooms) {
        Scanner keyboard = new Scanner(System.in);
        double squareFeet;
        double totalSquareFeet = 0;
        for (int room = 1; room <= numberOfRooms; room++) {
            System.out.println("Please enter the Square feet of wall space in room " + room);
            squareFeet = keyboard.nextDouble();
            totalSquareFeet += squareFeet;
        }
        return totalSquareFeet;
    }

    public static double calculateGallonsOfPaint(double totalWallSpace) {
        double gallonsOfPaint = (totalWallSpace / 115);
        return gallonsOfPaint;
    }

    public static double calculateHoursOfLabor(double totalWallSpace) {
        double hoursOfLabor = (totalWallSpace / 115) * 8;
        return hoursOfLabor;
    }

    public static double calculateCostOfPaint(double priceOfPaint, double caculateGallonsOfPaint) {
        double costOfPaint = caculateGallonsOfPaint * priceOfPaint;
        return costOfPaint;
    }

    public static double cacluateLaborCharges(double calculateHoursOfLabor, double chargePerHour) {
        double laborCharges = calculateHoursOfLabor * chargePerHour;
        return laborCharges;

    }

    public static double totalCost(double laborCharges, double costOfPaint) {
        double totalCost = laborCharges + costOfPaint;
        return totalCost;

    }

    public static void displayData(double gallonsOfPaint, double costOfPaint,
            double hoursOfLabor, double laborCharges, double totalCost) {
        System.out.println(" The number of gallons of paint Required: " + gallonsOfPaint
                + "\n The hours of labor required: " + hoursOfLabor + "\n The cost of paint: "
                + costOfPaint + "\n The labor Charges: " + laborCharges
                + "\n The total cost of the paint job: " + totalCost);

    }

}
