
import java.util.Scanner;

public class TestScores {

    public static void main(String[] args) throws InvalidTestScoreException {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter the number of tests: ");
        int numberOfTests = keyboard.nextInt();

        double sumOfAllGrades = 0;
        for (int i = 0; i < numberOfTests; i++) {

            System.out.println("Enter the grade for Test " + (i + 1) + ": ");
            double grade = keyboard.nextDouble();
            //get the sum of the grades for average 
            sumOfAllGrades += grade;
            if (grade < 0 || grade > 100) {
                throw new InvalidTestScoreException("Test score can not be negative or more than 100!");
            }
            
                System.out.println("The average of the test scores are: " 
                        + findAverage(sumOfAllGrades, numberOfTests));

            
        }
    }

    public static double findAverage(double sumOfAllGrades, int numberOfTests) {
        double average = 0;
        average = sumOfAllGrades / numberOfTests;
        return average;
    }

}
