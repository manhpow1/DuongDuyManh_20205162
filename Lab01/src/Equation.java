import java.util.Scanner;
public class Equation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please choose the type of equation to solve:");
        System.out.println("1. First-degree equation with one variable");
        System.out.println("2. System of first-degree equations with two variables");
        System.out.println("3. Second-degree equation with one variable");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Please enter the coefficients of the first-degree equation:");
                System.out.print("a: ");
                double a = scanner.nextDouble();
                System.out.print("b: ");
                double b = scanner.nextDouble();

                if (a == 0) {
                    System.out.println("This is not a valid first-degree equation.");
                } else {
                    double x = -b / a;
                    System.out.println("The solution is x = " + x);
                }

                break;
            case 2:
                System.out.println("Please enter the coefficients of the system of first-degree equations:");
                System.out.print("a11: ");
                double a11 = scanner.nextDouble();
                System.out.print("a12: ");
                double a12 = scanner.nextDouble();
                System.out.print("b1: ");
                double b1 = scanner.nextDouble();
                System.out.print("a21: ");
                double a21 = scanner.nextDouble();
                System.out.print("a22: ");
                double a22 = scanner.nextDouble();
                System.out.print("b2: ");
                double b2 = scanner.nextDouble();

                double det = a11 * a22 - a12 * a21;

                if (det == 0) {
                    System.out.println("This system of first-degree equations has no solution.");
                } else {
                    double x = (a22 * b1 - a12 * b2) / det;
                    double y = (a11 * b2 - a21 * b1) / det;
                    System.out.println("The solution is x = " + x + " and y = " + y);
                }

                break;
            case 3:
                System.out.println("Please enter the coefficients of the second-degree equation:");
                System.out.print("a: ");
                double a3 = scanner.nextDouble();
                System.out.print("b: ");
                double b3 = scanner.nextDouble();
                System.out.print("c: ");
                double c = scanner.nextDouble();

                double delta = b3 * b3 - 4 * a3 * c;

                if (delta < 0) {
                    System.out.println("This second-degree equation has no real solution.");
                } else if (delta == 0) {
                    double x = -b3 / (2 * a3);
                    System.out.println("The solution is x = " + x);
                } else {
                    double x1 = (-b3 - Math.sqrt(delta)) / (2 * a3);
                    double x2 = (-b3 + Math.sqrt(delta)) / (2 * a3);
                    System.out.println("The solutions are x1 = " + x1 + " and x2 = " + x2);
                }

                break;
            default:
                System.out.println("Invalid choice. Please choose again.");
        }
        scanner.close();
    }  
}
