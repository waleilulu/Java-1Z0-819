import java.util.List;
import java.util.function.UnaryOperator;

public class Q072 {
    public static void main(String[] args){
        var list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    
    //line 2
    UnaryOperator<Integer> u = i->i *2;
    
    //A
    //UnaryOperator u = (int i) -> i * 2;

    //B
    //UnaryOperator u = (var i) -> (i * 2);
    //UnaryOperator<Integer> u = (var i) -> (i * 2);


    //C
    //UnaryOperator u = var i -> { return i * 2; };

    //D
    //UnaryOperator u = i -> { return i * 2};
    //UnaryOperator<Integer> u = i -> i * 2;

    list.replaceAll(u);
    }
}
/*
Which can replace line 2?
*/
//B(但測試之後沒有一個符合條件)