public class Chapter7Q5 {
    public static void main(String[] args) {
    int [] intArray = {1,2,3,4,5,6,7,8};
    int number = 5;
    greaterThanN(intArray, number);
            
            
}
    public static int [] greaterThanN(int [] intArray , int number ){
        int returnedGreaterNumbersI = 0;
        int [] returnedGreaterNumbers = new int [intArray.length];
        
        for(int i =0; i < intArray.length; i++ ){
          if(intArray [i] > number ){
              returnedGreaterNumbers[returnedGreaterNumbersI] = intArray[i];
              returnedGreaterNumbersI++;
              
          }  
        }
        return returnedGreaterNumbers;
       
    }
}
