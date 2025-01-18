import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.CopyOnWriteArrayList;

public class Q170 {
    public static void main(String[] args) {
        List<Integer> original = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        removeElements(original);
        
    }

    public static void removeElements(List<Integer> original) {
        //A
        Queue<Integer> clq = new ConcurrentLinkedDeque<>(original);
        for (Integer w : clq) {
            clq.remove(w);  // 這會移除 clq 中的元素，但不會影響原來的 original list
        }
        System.out.println("clq: " + clq); //clq: []
        System.out.println("Original list: " + original);

        //B
        // List<Integer> al = new ArrayList<>(original);
        // for(Integer w: al) {
        //     al.remove(w);  // 這會拋出 ConcurrentModificationException，因為在迴圈中修改 List
        // }

        //C
        List<Integer> cwa = new CopyOnWriteArrayList<>(original);
        for(Integer w: cwa) {
            cwa.remove(w);  // 這會安全地移除 cwa 中的元素，但不會影響 original list
        }
        System.out.println("cwa: " + cwa); //cwa: []
        System.out.println("Original list: " + original);

        //D
        // List<Integer> sl = Collections.synchronizedList(original);
        // for(Integer w:sl)
        // sl.remove(w);
        // System.out.println("sl: " + sl);
        // System.out.println("Original list: " + original);
    }
    
    
}


//A、C
/*Which two code fragments remove the elements from the original list? (Choose two.)
A.
Queue clq = new ConcurrentLinkedDeque<>(original);
    for(Integer w: clq)
        clq.remove(w);
B.
List al = new ArrayList<>(original);
        for(Integer w: al)
            al.remove(w);
C.
List cwa = new CopyOnWriteArrayList<>(original);
    for(Integer w:cwa)
        cwa.remove(w);

D.
List sl = Collections.synchronizedList(original);
        for(Integer w:sl)
        sl.remove(w);

*/