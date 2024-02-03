import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        /*
         * Say Hello
         * Gets input of full name (first name and last name, separated by a space).
         * Prints "Hello, <full name>!".
         *
         * Example(s):
         * - If input is Brandon Krakowsky, print: "Hello, Brandon Krakowsky!"
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first name and last name, separated by a space: ");
        String nameEntered = scanner.nextLine();

        System.out.println("Hello, " + nameEntered + "!");

        /*
         * Add Five Numbers
         * Gets input of numbers (ints or doubles), and prints the sum (as a double) of all the numbers each time.
         *
         * Example(s):
         * - If input is 1, 2.4, 6, -1, and 0, print:
         * Sum: 1.0
         * Sum: 3.4
         * Sum: 9.4
         * Sum: 8.4
         * Sum: 8.4
         */

        Scanner scanDigit = new Scanner(System.in);
        double sum = 0.0;

        for (int xx = 0; xx < 5; xx++){

            double digEntered = scanDigit.nextDouble();
            sum += digEntered;
            System.out.println("Sum:" + sum);

        }

        /*
         * Even or Odd
         * Gets integer input and prints if it's even or odd.
         *
         * Example(s):
         * - If input is 5, print: "5 is odd"
         * - If input is 4, print: "4 is even"
         */

        Scanner digitScan = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int digitToTest = digitScan.nextInt();

        if (digitToTest % 2 == 0){
            System.out.println(digitToTest + " is even");
        } else {
            System.out.println(digitToTest + " is odd");
        }




    }


}


