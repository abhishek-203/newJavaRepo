// 17. Write a Java program to find all roots of a quadratic equation.
package basicQuestion;

import java.util.Scanner;

public class ifElse17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the coefficients of the quadratic equation (ax^2 + bx + c = 0):");

        double a = sc.nextDouble(); // The coefficient of x^2
        double b = sc.nextDouble(); // The coefficient of x
        double c = sc.nextDouble(); // The constant term

        sc.close();
        // Calculate the discriminant (b^2 - 4ac)
        double d = b * b - 4 * a * c;

        // Check if the discriminant is positive, zero or negative
        if (d > 0) {
            // There are two distinct real roots
            // Calculate the roots using the quadratic formula
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println("The roots are: " + x1 + " and " + x2);
        } else if (d == 0) {
            double x = -b / (2 * a);

            System.out.println("The root is: " + x);
        } else {
            // There are no real roots, but two complex roots
            // Calculate the real and imaginary parts of the complex roots using the quadratic formula
            double real = -b / (2 * a); // The real part of both complex roots
            double imag = Math.sqrt(-d) / (2 * a); // The absolute value of the imaginary part of both complex roots

            // Print the complex roots
            System.out.println("The roots are: " + real + " + " + imag + "i and " + real + " - " + imag + "i");
        }
    }
}
