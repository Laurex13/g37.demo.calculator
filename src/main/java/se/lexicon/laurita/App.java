package se.lexicon.laurita;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) {
        System.out.println("Lets Calculate");
        System.out.println();
          Calculator calculator = new Calculator();
          Scanner scanner = new Scanner(System.in);
          System.out.println("Enter both Numbers:   a b"  );
          int a = args.length; //read input
        int b = args.length; //read input

        a = scanner.nextInt();
        b = scanner.nextInt();
        calculator.add (a , b);
        calculator.multiply(a , b);
        calculator.subtract(a , b);
        calculator.divide(a , b);


        System.out.println("Do you want to perform another calculation? (y/n)");
          scanner.close();


    }

}
