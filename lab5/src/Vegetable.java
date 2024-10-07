public abstract class Vegetable implements Comparable<Vegetable> {
    protected String name;
    protected double calories;
    protected int freshness;

    public Vegetable(String name, double calories, int freshness) {
        this.name = name;
        this.calories = calories;
        this.freshness = freshness;
    }

    public abstract double vitaminContent();

    @Override
    public int compareTo(Vegetable other) {
        return Double.compare(this.vitaminContent(), other.vitaminContent());
    }

    @Override
    public String toString() {
        return name + " (Calories: " + calories + ", Freshness: " + freshness + ")";
    }
}