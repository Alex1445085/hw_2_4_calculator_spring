package pro.sky.calculator.HW24;

public interface CalculatorService {
    default String hello(){ return "Welcome to calculator!"; };
    String plus(double num1, double num2);
    String minus(double num1, double num2);
    String multiply(double num1, double num2);
    String divide(double num1, double num2);
}
