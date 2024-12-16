import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Q071 {
    public static void main(String[] args) throws InterruptedException {
        var c= new CopyOnWriteArrayList<>(List.of("1", "2", "3", "4"));
    Runnable r = () ->{
        try {
            Thread.sleep(150);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        c.set(3, "four");
        System.out.print(c+" ");
    };
    Thread t = new Thread(r);
    t.start();
    for(var s: c){
        System.out.print(s + " ");
        Thread.sleep(100);
    }
    }
    
}
//D
/*
What is the output?
A. 1 2 [1, 2, 3, four] 3 four
B. 1 2 [1, 2, 3, 4] 3 4
C. 1 2 [1, 2, 3, 4] 3 four
D. 1 2 [1, 2, 3, four] 3 4
*/
