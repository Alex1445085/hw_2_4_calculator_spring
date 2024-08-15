package pro.sky.calculator.HW24;

public interface CalculatorService {
    default String hello(){ return "Welcome to calculator!"; };
    String plus(Double num1, Double num2);
    String minus(Double num1, Double num2);
    String multiply(Double num1, Double num2);
    String divide(Double num1, Double num2);
}
