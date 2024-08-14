package pro.sky.calculator.HW24;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    CalculatorServiceImpl calculate = new CalculatorServiceImpl();

    int counter = 0;

    @GetMapping
    public String hello() {
        return calculate.hello() + ", " + counter;
    }

    @GetMapping("/plus")
    public String plus(@RequestParam("num1") String num1, @RequestParam("num2") String num2) {
        return calculate.menu("plus", num1, num2);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam("num1") String num1, @RequestParam("num2") String num2) {
        return calculate.menu("minus", num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam("num1") String num1, @RequestParam("num2") String num2) {
        return calculate.menu("multiply", num1, num2);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam("num1") String num1, @RequestParam("num2") String num2) {
        return calculate.menu("divide", num1, num2);
    }
}