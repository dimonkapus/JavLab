import java.util.Scanner;

public class B0104 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Перше число: ");
        int num1 = scanner.nextInt();
        System.out.print("Друге число: ");
        int num2 = scanner.nextInt();
        System.out.print("Третє число: ");
        int num3 = scanner.nextInt();

        double geometricMean = Math.cbrt(num1 * num2 * num3);

        System.out.printf("Середнє геометричне: %.4f%n", geometricMean);

        scanner.close();
    }
}
