import java.util.Arrays;

public class B0303 {
    private final double[] coefficients;

    public B0303(int degree) {
        this.coefficients = new double[degree + 1];
    }

    public B0303(double[] coefficients) {
        this.coefficients = Arrays.copyOf(coefficients, coefficients.length);
    }

    public int degree() {
        return coefficients.length - 1;
    }

    public B0303 add(B0303 other) {
        int maxDegree = Math.max(this.degree(), other.degree());
        double[] result = new double[maxDegree + 1];

        for (int i = 0; i <= this.degree(); i++) {
            result[i] += this.coefficients[i];
        }

        for (int i = 0; i <= other.degree(); i++) {
            result[i] += other.coefficients[i];
        }

        return new B0303(result);
    }

    public B0303 subtract(B0303 other) {
        int maxDegree = Math.max(this.degree(), other.degree());
        double[] result = new double[maxDegree + 1];

        for (int i = 0; i <= this.degree(); i++) {
            result[i] += this.coefficients[i];
        }

        for (int i = 0; i <= other.degree(); i++) {
            result[i] -= other.coefficients[i];
        }

        return new B0303(result);
    }

    public B0303 multiply(B0303 other) {
        int resultDegree = this.degree() + other.degree();
        double[] result = new double[resultDegree + 1];

        for (int i = 0; i <= this.degree(); i++) {
            for (int j = 0; j <= other.degree(); j++) {
                result[i + j] += this.coefficients[i] * other.coefficients[j];
            }
        }

        return new B0303(result);
    }

    public static B0303 sumOfB0303(B0303[] polynoms) {
        B0303 result = new B0303(new double[]{0});

        for (B0303 p : polynoms) {
            result = result.add(p);
        }

        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = degree(); i >= 0; i--) {
            if (coefficients[i] != 0) {
                sb.append(coefficients[i] > 0 && i != degree() ? " + " : "")
                        .append(coefficients[i])
                        .append(i > 0 ? "x^" + i : "");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        B0303 p1 = new B0303(new double[]{1, 2, 3});  // 1 + 2x + 3x^2
        B0303 p2 = new B0303(new double[]{2, 1});     // 2 + x
        B0303 p3 = new B0303(new double[]{0, 0, 4});  // 4x^2

        B0303[] polynoms = {p1, p2, p3};
        B0303 sum = B0303.sumOfB0303(polynoms);

        System.out.println("Поліном 1: " + p1);
        System.out.println("Поліном 2: " + p2);
        System.out.println("Поліном 3: " + p3);
        System.out.println("Сума поліномів: " + sum);
    }
}
