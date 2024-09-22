public class B0217c {

    public static double seriesSum(double x, double epsilon) {
        if (Math.abs(x) >= 1) {
            throw new IllegalArgumentException("x має бути в діапазоні |x| < 1");
        }

        double sum = 0.0;
        double term;
        int k = 0;

        do {
            term = Math.pow(-1, k) * (1 + k) * Math.pow(x, k);
            sum += term;
            k++;
        } while (Math.abs(term) >= epsilon);

        return sum;
    }

    public static void main(String[] args) {
        double x = 0.5;
        double epsilon = 1e-6;
        double result = seriesSum(x, epsilon);
        System.out.println("Сума ряду: " + result);
    }
}
