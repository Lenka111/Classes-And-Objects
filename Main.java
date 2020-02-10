/*Main class test code*/
public class Main {
    
    public static void main(String[] args) {
        
        // create object calculator
        SimpleCalculator calculator = new SimpleCalculator(); 
        
        // set the value of the first number
        calculator.setFirstNumber(5.0);
        
        //set the value of the second number
        calculator.setSecondNumber(4);
        
        //print adition of the values set above
        System.out.println("add = " + calculator.getAdditionResult());
        
        //print subtraction of the values set above
        System.out.println("subtract= " + calculator.getSubtractionResult());
        
        // set the value of the first number
        calculator.setFirstNumber(5.25);
        
        //set the value of the second number
        calculator.setSecondNumber(0);
        
        // print multiplication and division result 
        System.out.println("multiply = " + calculator.getMultiplicationResult());
        System.out.println("divide = " + calculator.getDivisionResult());
}
}
