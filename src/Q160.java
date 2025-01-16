import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Q160 {
    List<String> states = new ArrayList(List.of("NY", "CA", "WA", "NC", "CO"));
    public static void main(String[] args) {
    Q160 q160 = new Q160();
    // line 1
    //A
    //Supplier function = () -> states.contains("N");

    //B
    //Function function = s -> s.contains('N");

    //C
    //Consumer function = s -> {if(s.contains("N")) states.remove(s);};

    //D
    Predicate<String> function = s -> s.contains("N");
    

    q160.states.removeIf(function);
    System.out.println(q160.states); //[CA, WA, CO]
    }
    
}


//D
/*
Which statement on line 1 enables this code to compile?
A. Supplier function = () -> states.contains("N");
B. Function function = s -> s.contains('N");
C. Consumer function = s -> {if(s.contains("N")) states.remove(s);};
D. Predicate function = s -> s.contains("N");
*/
