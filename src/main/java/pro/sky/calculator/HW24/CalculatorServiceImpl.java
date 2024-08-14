package pro.sky.calculator.HW24;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String menu(String action, String temp1, String temp2) {
        ArrayList<String> listOfNum = new ArrayList<>();
        if (!(temp1.isEmpty())) { listOfNum.add(temp1); };
        if (!(temp2.isEmpty())) { listOfNum.add(temp2); };
        if (listOfNum.size() < 2) {
            return "Ожидается ввод 2-х чисел! А сейчас их " + listOfNum.size();
        } else {
            double num1 = Double.parseDouble(temp1);
            double num2 = Double.parseDouble(temp2);
            switch (action) {
                case ("plus"): {
                    return plus(num1, num2);
                }
                case ("minus"): {
                    return minus(num1, num2);
                }
                case ("multiply"): {
                    return multiply(num1, num2);
                }
                case ("divide"): {
                    return divide(num1, num2);
                }
                default: {
                    return "Нет такого действия!";
                }
            }
        }
    }

    @Override
    public String plus(double num1, double num2) {
        return "result: " + num1 + " + " + num2 + " = " + (num1 + num2);
    }

    @Override
    public String minus(double num1, double num2) {
        return "result: " + num1 + " - " + num2 + " = " + (num1 - num2);
    }

    @Override
    public String multiply(double num1, double num2) {
        return "result: " + num1 + " * " + num2 + " = " + (num1 * num2);
    }

    @Override
    public String divide(double num1, double num2) {
        if (num2 == 0) {
            return "Деление на 0 недопустимо!";
        } else {
            return "result: " + num1 + " / " + num2 + " = " + (num1 / num2);
        }
    }
}