package Task1;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Model implements I_Addition, I_Substraction, I_Division, I_Multiplication {
    private static final Logger logger = Logger.getLogger(Model.class.getName());

    @Override
    public void addition(double number1, double number2) {
        double result = number1 + number2;
        logger.log(Level.INFO, "{0} + {1} = {2}", new Object[]{number1, number2, result});
    }

    @Override
    public void division(double number1, double number2) {
        double result = number1 / number2;
        if (number2 != 0) {
            logger.log(Level.INFO, "{0} / {1} = {2}", new Object[]{number1, number2, result});
        } else {
            throw new ArithmeticException("Деление на ноль не допускается.");
        }
    }

    @Override
    public void multiplication(double number1, double number2) {
        double result = number1 * number2;
        logger.log(Level.INFO, "{0} * {1} = {2}", new Object[]{number1, number2, result});
    }

    @Override
    public void substraction(double number1, double number2) {
        double result = number1 - number2;
        logger.log(Level.INFO, "{0} - {1} = {2}", new Object[]{number1, number2, result});
    }
}
