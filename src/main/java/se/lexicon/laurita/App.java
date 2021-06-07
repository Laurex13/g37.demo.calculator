package se.lexicon.laurita;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    private static final Scanner getInputString = new Scanner(System.in);



    public static void main( String[] args ) {

        boolean calculate = true;
        while (calculate) {
            System.out.println("Do you want to calculate? (y/n)");
            String result_n = getInputString.nextLine();

            if (result_n.equalsIgnoreCase("n")) {
                calculate = false;
            }  else {

                System.out.println("Lets Calculate");
                System.out.println();
                Calculator calculator = new Calculator();
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter both Numbers:   a b");
                int a = args.length; //read input
                int b = args.length; //read input

                a = scanner.nextInt();
                b = scanner.nextInt();
                calculator.add(a, b);
                calculator.multiply(a, b);
                calculator.subtract(a, b);
                calculator.divide(a, b);
            }

        }
    }}