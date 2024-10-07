import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Salad {
    private final List<Vegetable> vegetables;

    public Salad() {
        vegetables = new ArrayList<>();
    }

    public void addVegetable(Vegetable vegetable) {
        vegetables.add(vegetable);
    }

    public double totalCalories() {
        return vegetables.stream().mapToDouble(v -> v.calories).sum();
    }

    public void sortByVitaminContent() {
        Collections.sort(vegetables);
    }

    public List<Vegetable> findByFreshness(int minFreshness, int maxFreshness) {
        List<Vegetable> result = new ArrayList<>();
        for (Vegetable v : vegetables) {
            if (v.freshness >= minFreshness && v.freshness <= maxFreshness) {
                result.add(v);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Vegetable v : vegetables) {
            sb.append(v).append("\n");
        }
        return sb.toString();
    }
}
