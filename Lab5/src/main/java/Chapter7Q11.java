
public class Chapter7Q11 {

    public static void main(String[] args) {
        double [] numbers = {14.5,4.8, 30.5, 6.34, 4.2};
        System.out.println ("Total: " + getTotal(numbers)
                + "\nAverage: " + String.format("%.2f", getAverage(numbers)) 
                + "\nHighest Number: " + getHighest(numbers)
                + "\nLowest Number: " + getlowest(numbers) );
    }

    public static double getTotal(double[] numbers) {
        double total = 0;

        for (int i = 0; i < numbers.length; i++) {
            total = total + numbers[i];
        }
        return total;
    }

    public static double getAverage(double[] numbers) {
        double numbersTotal = getTotal(numbers);
        int totalNumbersInArray = numbers.length;
        double average = numbersTotal / totalNumbersInArray;
        return average;
    }
    //same logic for highest and lowest except less than on lowest number
    public static double getHighest(double[] numbers) {
        double highestNumber = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
           if(numbers[i]> highestNumber){
               highestNumber = numbers[i];
           } 
        }
        return highestNumber;
    }
    public static double getlowest(double[] numbers) {
        double lowestNumber = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
           if(numbers[i]< lowestNumber){
               lowestNumber = numbers[i];
           } 
        }
        return lowestNumber;
    }
    
}
