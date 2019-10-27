
public class Chapter7Q11 {
    public static void main(String[] args) {
        
    }
    public static double getTotal(double [] numbers ){
        double total =0;
        
        for (int currentNumbersI = 0; currentNumbersI< numbers.length; currentNumbersI++){
          total = total + numbers[currentNumbersI];  
        }
        return total;
    }
    public static double getAverage(double [] numbers){
        double numbersTotal = getTotal(numbers);
        int totalNumbersInArray = numbers.length;
        double average = numbersTotal / totalNumbersInArray;
        return average;
    }
    
}
