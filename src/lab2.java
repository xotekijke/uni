import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value for x: "); // can't be < 0
        double x = scanner.nextDouble(); // -0.5

        System.out.print("Enter value for a: ");
        double a = scanner.nextDouble(); // 7.12

        System.out.print("Enter value for b: ");
        double b = scanner.nextDouble(); // 8.12

        System.out.print("Enter value for c: ");
        double c = scanner.nextDouble(); // 1.8

        double result = 0;

        double expAx = Math.exp(a * x);
        double tan = Math.tan(b * x + c);
        double part1 = expAx * tan;

        double log2AxC = Double.NaN;
        if (a * x - c > 0) {
            log2AxC = Math.log(a * x - c) / Math.log(2);
        } else {
            System.out.println("(a * x - c) must be > 0");
            return;
        }

        double expBx2 = Math.exp(b * Math.pow(x, 2));
        double part2 = log2AxC / (expBx2 - 1);

        result = part1 + part2;

        System.out.printf("Result: %.3f%n", result);
    }
}
