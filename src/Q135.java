import java.util.List;
import java.util.Comparator;

public class Q135 {
    List<String> fruits = List.of("banana", "orange", "apple", "lemon");
    
    public Q135(){
        // line 2
        // fruits.sort(new Comparator<String>() {
        //     @Override
        //     public int compare(String m, String n) {
        //         return n.compareTo(m);
        //     }
        // });

        // Lambda 語法
        fruits.sort((String d, String e) -> e.compareTo(d)); //可以寫成這樣，指定了參數類型
        fruits.sort( (o, p) -> p.compareTo(o)); // 這也可以，不指定參數類型
    }

    public static void main(String[] args) {
        Q135 q135 = new Q135();
        System.out.println(q135.fruits);
    }
    
}
//A
/*
Which statement will refactor line 2 to use a lambda expression?
A. fruits.sort((String d, String e) -> e.compareTo(d));
B. fruits.sort( o, p -> p.compareTo(o));
C. fruits.sort((String x, y) -> (return y.compareTo(x)));
D. fruits.sort((a, b) -> (return b.compareTo(a);));
*/