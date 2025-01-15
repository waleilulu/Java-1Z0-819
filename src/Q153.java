import java.util.ArrayList;
import java.util.List;

public class Q153 {
    static void add(List l){
        l.add(4);
        l.add(3.14f); // 3.14f是float
    }
    public static void main(String[] args) {
        var x = new ArrayList();
        //var x = new ArrayList<Object>(); //這裡只能用Object，因為後面有加入int和float
        x.add(3);
        add(x);
        for (Integer i : x){
        //for (Object i : x){ //這裡只能用Object，因為後面有加入int和float
            System.out.print(i + " ");
        }
    }
}

//A
/*
What is the result?
A. The program prints 3 4 and throws a ClassCastException.
B. 3 4
C. 3 4 3.14
D. 3 4 3
*/