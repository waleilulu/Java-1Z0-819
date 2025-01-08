import java.util.ArrayList;
import java.util.List;

public class Q103 {
    public static void main(String[] args) {
        List vegetables = new ArrayList<>();
        vegetables.add("Kale");
        vegetables.add(0, "Lettuce");
        System.out.println(vegetables);

        List fish = new ArrayList<>();
        fish.add("Salmon");
        fish.add(0, "Seabass");
        System.out.println(fish);
    }
}
//C
/*
What is the result?
A. [Lettuce, Kale]
B. A compilation error is thrown.
C. [Lettuce, Kale]
[Seabass, Salmon]
D. [Kale, Lettuce]
[Salmon, Seabass]
*/