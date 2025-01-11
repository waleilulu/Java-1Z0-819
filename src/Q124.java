import java.util.Arrays;
import java.util.Comparator;

public class Q124 {
    public static void main(String[] args) {
        String[] towns = {"boston", "paris", "bangkok", "oman"};
        Comparator<String> ms = (a, b) -> b.compareTo(a);
        Arrays.sort(towns, ms);
        System.out.println(Arrays.binarySearch(towns, "oman", ms));
    }
}

//C
/*
What is the result?
A. 2
B. -1
C. 1
D. -3
Correct Answer:C
*/