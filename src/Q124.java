import java.util.Arrays;
import java.util.Comparator;

public class Q124 {
    public static void main(String[] args) {
        String[] towns = {"boston", "paris", "bangkok", "oman"};
        Comparator<String> ms = (a, b) -> b.compareTo(a); //b.compareTo(a) 則用於實現降序排列的比較邏輯。
        Arrays.sort(towns, ms); //["paris", "oman", "boston", "bangkok"]
        System.out.println(Arrays.binarySearch(towns, "oman", ms)); //1
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