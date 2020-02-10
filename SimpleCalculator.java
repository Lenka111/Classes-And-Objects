public class SimpleCalculator {
    
   // instance variables(fields)
    private double firstNumber; 
    private double secondNumber;

    //get the value of firstNumber field
    public double getFirstNumber(){
        return this.firstNumber;
    }
    //get the value of secondNumber field
    public double getSecondNumber(){
        return this.secondNumber;
    }
    // set the value of firstNumber field
    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }
    //set the value of secondNumber field
    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }
    // add the field values of firstNumber and secondNumber
    public double getAdditionResult(){
        return firstNumber + secondNumber;
    }
    //subtract the field values of firstNumber and secondNumber
    public double getSubtractionResult(){
        return firstNumber - secondNumber;
    }
    //multiply the field values of firstNumber and secondNumber
    public double getMultiplicationResult(){
        return firstNumber * secondNumber;
    }
    //divide the field values of firstNumber and secondNumber
    public double getDivisionResult(){
        //if divison by zero return 0
        if (secondNumber==0)
            return 0;
        return firstNumber / secondNumber;
    }

}
