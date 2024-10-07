import java.util.List;

public class Chef {
    public void prepareSalad() {
        Salad salad = new Salad();

        salad.addVegetable(new Carrot(8));
        salad.addVegetable(new Cucumber(5));
        salad.addVegetable(new Tomato(7));
        salad.addVegetable(new Carrot(9));

        System.out.println("Салат приготований:");
        System.out.println(salad);

        System.out.println("Загальна калорійність: " + salad.totalCalories() + " калорій");

        salad.sortByVitaminContent();
        System.out.println("\nСалат після сортування за вітамінізацією:");
        System.out.println(salad);

        System.out.println("\nОвочі з рівнем свіжості між 6 і 10:");
        List<Vegetable> freshVegetables = salad.findByFreshness(6, 10);
        for (Vegetable v : freshVegetables) {
            System.out.println(v);
        }
    }
}
