import java.util.Scanner;

public class B0105 {
    public static void main(String[] args) {
        int N, M;

        if (args.length == 2) {
            try {
                N = Integer.parseInt(args[0]);
                M = Integer.parseInt(args[1]);

                if (N <= 0 || M <= 0) {
                    System.out.println("Числа N та M повинні бути додатніми.");
                    return;
                }
            } catch (NumberFormatException e) {
                System.out.println("Будь ласка, введіть коректні цілі числа.");
                return;
            }
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введіть число N (кількість випадкових чисел): ");
            N = scanner.nextInt();
            System.out.print("Введіть число M (максимальне значення): ");
            M = scanner.nextInt();
            scanner.close();

            if (N <= 0 || M <= 0) {
                System.out.println("Числа N та M повинні бути додатніми.");
                return;
            }
        }

        for (int i = 0; i < N; i++) {
            int randomNumber = (int) (Math.random() * M);
            System.out.println(randomNumber);
        }
    }
}
