package Task1;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class View {
    private static final Logger logger = Logger.getLogger(View.class.getName());
    private Scanner scan = new Scanner(System.in);

    public double getDouble1() {
        System.out.print("Enter operand 1: ");
        double num = scan.nextDouble();
        return num;
    }

    public double getDouble2() {
        System.out.print("Enter operand 2: ");
        double num = scan.nextDouble();
        return num;
    }

    public String getOper() {
        System.out.print("Enter an operator (+, -, *, /): ");
        return scan.next();
    }
}

