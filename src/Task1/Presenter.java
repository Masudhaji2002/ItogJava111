package Task1;

import java.util.logging.Level;
import java.util.logging.Logger;



public class Presenter {
    private static final Logger logger = Logger.getLogger(Presenter.class.getName());

    Model m1 = new Model();
    View v1 = new View();

    public void start() {
        String operator = v1.getOper();
        double number1 = v1.getDouble1();
        double number2 = v1.getDouble2();

        switch (operator) {
            case "+":
                m1.addition(number1, number2);
                break;
            case "-":
                m1.substraction(number1, number2);
                break;
            case "*":
                m1.multiplication(number1, number2);
                break;
            case "/":
                m1.division(number1, number2);
                break;
            default:
                logger.log(Level.WARNING, "Invalid operator: {0}", operator);
                break;
        }
    }
}

