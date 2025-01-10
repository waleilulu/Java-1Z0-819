import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Q118 {
    public static void main(String[] args) {
        String[] words = {"am", "am", "first", "second", "mismatch"};
        Map map = Arrays.stream(words)
                        .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println(map);
    }
    
}

//D
/*
Taking into account that the order of the elements is unpredictable, what is the output?
A. {am=2, first=1, mismatch=1, second=2}
B. {mismatch=2, am=2, first=1, second=1}
C. {l=mismatch, 2=am}
D. {mismatch=1, am=2, first=1, second=1}
*/