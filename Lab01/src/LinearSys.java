import java.util.Scanner;
public class LinearSys {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the coefficients for the first equation (ax + by = c):");
        System.out.print("a: ");
        double a1 = input.nextDouble();
        System.out.print("b: ");
        double b1 = input.nextDouble();
        System.out.print("c: ");
        double c1 = input.nextDouble();

        System.out.println("Enter the coefficients for the second equation (dx + ey = f):");
        System.out.print("d: ");
        double a2 = input.nextDouble();
        System.out.print("e: ");
        double b2 = input.nextDouble();
        System.out.print("f: ");
        double c2 = input.nextDouble();

        double determinant = a1 * b2 - a2 * b1;

        if (determinant == 0) {
            System.out.println("The system has no unique solution.");
        } else {
            double x = (c1 * b2 - c2 * b1) / determinant;
            double y = (a1 * c2 - a2 * c1) / determinant;
            System.out.println("The solution is x = " + x + " and y = " + y);
        }
        input.close();
    }
}
