import java.util.InputMismatchException;
import java.util.Scanner;

public class Excercise {
    public static void main(String[] args) {
//        int x = 22;
//        int y = 0;
//        System.out.println(devideByNumber(x, y));
//        System.out.println(devideEAFP(x, y));
//        System.out.println(devide(x, y));


        // int x = getInt();
        int x = getIntB();
        // int x = getIntE();
        System.out.println("X is : " + x);


    }

    private static int getInt() {
        Scanner keyword = new Scanner(System.in);
        return keyword.nextInt();
    }

    /*
     *with integer value the returned number will be the same given value, but
     * with a value from another type like String ,then 0 will be
     * returned
     */
    private static int getIntB() {
        Scanner s = new Scanner(System.in);
        boolean isValid = true;
        System.out.println("Enter an Integer:");
        String input = s.next();
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                isValid = false;
                break;
            }
        }

        if (isValid) {
            return Integer.parseInt(input);
        }
        return 0;
    }

    /*
     * when integer value is inputed ,it will give the value back ,but with other
     * values like String ,the returned value will be 0
     */
    private static int getIntE() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter an Integer :");
        try {
            return keyboard.nextInt();
        } catch (InputMismatchException ex) {
            return 0;
        }
    }


    private static int devideByNumber(int x, int y) {
        if (y != 0) {
            return x / y;

        } else {
            return 0;
        }
    }


    private static int devideEAFP(int x, int y) {
        try {
            return x / y;

        } catch (ArithmeticException e) {
            return 0;
        }
    }

    private static int devide(int x, int y) {
        return x / y;
    }


}

