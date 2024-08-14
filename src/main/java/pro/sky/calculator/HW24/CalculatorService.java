package pro.sky.calculator.HW24;

public interface CalculatorService {
    default String hello(){ return "Welcome to calculator!"; };
    default String plus(double num1, double num2){ return null; }
    default String minus(double num1, double num2){ return null; }
    default String multiply(double num1, double num2){ return null; }
    default String divide(double num1, double num2){ return null; }
}
