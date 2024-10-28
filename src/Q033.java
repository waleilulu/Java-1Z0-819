import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q033 {
    public static void main(String[] args) {
        List<String> fruits = List.of("banana", "orange", "apple", "lemon"); 
        Stream<String> s1 = fruits.stream(); 
        Stream<String> s2 = s1.peek(i -> System.out.print("C: " + i + " ")); 
        System.out.println("A----------"); 
        Stream<String> s3 = s2.sorted(); 
        Stream<String> s4 = s3.peek(i -> System.out.print("D: " + i + " "));
        System.out.println("B----------");
        String strFruits = s4.collect(Collectors.joining(","));

    }
}
/*
----------
----------
banana orange apple lemon apple banana lemon orange 
*/