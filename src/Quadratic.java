import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {

        // Creates a Scanner object to read user inputs
        Scanner scanner = new Scanner(System.in);

        // Prompts and reads user inputs
        System.out.print("Please input value of a: ");
        double a = scanner.nextDouble();
        System.out.print("Please input value of b: ");
        double b = scanner.nextDouble();
        System.out.print("Please input value of c: ");
        double c = scanner.nextDouble();

        // printf: format print
        //      swift: "\(a)x^2 + \(b)x + \(c) = 0"
        //      python: f"{a}x^2 + {b}x" + {c} = 0"
        // %.2f: placeholder for floating point number with 2 decimal places
        System.out.printf("%.2fx^2 + %.2fx + %.2f = 0\n", a, b, c);

        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta > 0) {
            System.out.println("There are two real roots. They are");
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("x1 is %.4f\nx2 is %.4f\n", x1, x2);
        } else if (delta == 0) {
            System.out.println("There is only one real root. It is");
            double x = (-b) / (2 * a);
            System.out.printf("x is %.4f\n", x);
        } else {
            System.out.println("There is no real root.");
        }

    }
}
