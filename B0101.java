import java.util.Scanner;

public class B0101 {

        public static void main(String[] args) {

            System.out.print("Введіть ім’я: ");

            Scanner scanner = new Scanner(System.in);

            String name = scanner.nextLine();

            System.out.println("Привіт, " + name + "!");

            scanner.close();
        }
    }



