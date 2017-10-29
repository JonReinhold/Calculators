import java.util.Scanner;
import static java.lang.System.out;


public class CalcJv {
    public static void main(String[] args) {
    double arg1;
		double arg2;
        String action;
        Scanner scannerObject = new Scanner(System.in);

        System.out.println("First number: ");
        arg1 = scannerObject. nextDouble();
        System.out.println("Second number: ");
        arg2 = scannerObject. nextDouble();
        Scanner op = new Scanner(System.in);
        System.out.println("-,+,*,/ ?");
        action = op.next();

        switch (action)  {
        case "+":
            System.out.println("Your answer is " + (arg1 + arg2));
            break;

        case "-":
            System.out.println("Your answer is " + (arg1 - arg2));
            break;

        case "/":
            System.out.println("Your answer is " + (arg1 / arg2));
            break;

        case "*":
            System.out.println("Your asnwer is " + (arg1 * arg2));
            break;


        }
    }
}
