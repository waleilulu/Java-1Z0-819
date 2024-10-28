import java.util.List;
import java.util.Optional;

public class Q035 {
    public static void main(String[] args) {
        var items = List.of(new Item("A", 10), new Item("B", 2), new Item("C", 12), new Item("D", 5), new Item("E", 6));
        //double avg = items.stream().mapToInt(i -> i.amount).average().orElse(0, 0);
        double avg = items.stream().mapToInt(i -> i.amount).average().orElse(0);
        Optional<Item> item = items.parallelStream()
                .filter(i -> i.amount < avg).findAny();
        System.out.println(item.orElseThrow());
    }

    static class Item {
        public String name;
        public int amount;

        public Item(String name, int amount) {
            this.name = name;
            this.amount = amount;
        }

        @Override
        public String toString() {
            return "Name: " + name + ", Amount: " + amount;
        }
    }
}
// What is true?
// A. A NoSuchElementException is thrown at run time.
// B. The compilation fails.
// C. This should print the same result each time the program runs.

// D. This may not print the same result each time the program runs. //每次印出來的都不一樣
//Name: E, Amount: 6 
//Name: B, Amount: 2.....