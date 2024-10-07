public class Carrot extends Vegetable {
    public Carrot(int freshness) {
        super("Carrot", 41, freshness);
    }

    @Override
    public double vitaminContent() {
        return 10 * freshness;
    }
}