public class Tomato extends Vegetable {
    public Tomato(int freshness) {
        super("Tomato", 18, freshness);
    }

    @Override
    public double vitaminContent() {
        return 8 * freshness;
    }
}