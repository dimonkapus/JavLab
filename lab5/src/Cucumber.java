public class Cucumber extends Vegetable {
    public Cucumber(int freshness) {
        super("Cucumber", 16, freshness);
    }

    @Override
    public double vitaminContent() {
        return 5 * freshness;
    }
}