public class Calculator {

//    private int num1;
//    private int num2;
//    private char operator;
//
//    public Calculator(int num1, int num2){
//        this.num1 = num1;
//        this.num2 = num2;
//    }

    public int add(int num1, int num2){
        return num1 + num2;
    }

    public int subtract(int num1, int num2){
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public double divide(double num1, double num2){
        if(num2 ==0){
            throw new ArithmeticException("Cannot divide by zero");
        } else {
            return num1 / num2;
        }
    }
}
