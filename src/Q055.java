import java.util.List;
import java.util.function.Consumer;

public class Q055 {
    public static void main(String[] args) {
        var fruits = List.of("apple", "orange", "banana", "lemon");
    
        Consumer<String> function = (f) -> System.out.println(f);
        //Consumer function = (String f) -> (System.out.println(f);};   
        fruits.forEach(function);
    }
}

//A，但A也錯，需要修改成Consumer<String> function = (f) -> System.out.println(f);
/*
Which statement on line 1 enables this code to compile?
A. Consumer function = (String f) -> (System.out.println(f);};
B. Supplier function = () -> fruits.get (0);
C. Predicate function = a -> a.equals("banana");
D. Function function = x -> x.substring(0,2);
*/