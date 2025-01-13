import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Q140 {
    Integer[] ints = {1, 2, 3, 4, 5, 6, 7};
    List<Integer> list = Arrays.asList(ints);
    //UnaryOperator<Integer> uo = x -> x * 3; // line A
    //A
    UnaryOperator<Integer> uo = (var x) -> x * 3;
    //B
    //UnaryOperator<Integer> uo = (int x) -> x * 3;
    //C
    //UnaryOperator<Integer> uo = var x -> ( return x * 3; );
    //D
    //UnaryOperator<Integer> uo = x -> ( return x * 3);
    
    public void replaceAll() {
        list.replaceAll(uo);
    }

    public static void main(String[] args) {
        Q140 q140 = new Q140();
        q140.replaceAll();
        System.out.println(q140.list);
    }
}


//A，[3, 6, 9, 12, 15, 18, 21]
/*
Which can replace line A?
A. UnaryOperator<Integer> uo = (var x) -> (x * 3);
B. UnaryOperator<Integer> uo = (int x) -> x * 3;
C. UnaryOperator<Integer> uo = var x -> ( return x * 3; );
D. UnaryOperator<Integer> uo = x -> ( return x * 3);
*/

