public class SimpleCalculator {
    // write your code here
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber(){
        return this.firstNumber;
    }//1
    public double getSecondNumber(){
        return this.secondNumber;
    }//2
    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }//3
    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }//4

    public double getAdditionResult(){
        return firstNumber + secondNumber;
    }//5
    public double getSubtractionResult(){
        return firstNumber - secondNumber;
    }//6
    public double getMultiplicationResult(){
        return firstNumber * secondNumber;
    }
    public double getDivisionResult(){
        if (secondNumber==0)
            return 0;
        return firstNumber / secondNumber;
    }

}