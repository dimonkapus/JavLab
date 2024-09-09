public class B0103 {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Не введено жодного аргументу.");
            return;
        }

        int product = 1;
        boolean allIntegers = true;

        for (String arg : args) {
            try {
                int number = Integer.parseInt(arg);
                product *= number;
            } catch (NumberFormatException e) {
                allIntegers = false;
                System.out.println("Аргумент \"" + arg + "\" не є цілим числом.");
            }
        }

        if (allIntegers) {
            System.out.println("Добуток аргументів: " + product);
        }
    }
}
