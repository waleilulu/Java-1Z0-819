import java.util.ArrayList;
import java.util.Iterator;

public class Q074 {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(1);
        a1.add(2);
        a1.add(3);
        Iterator<Integer>itr = a1.iterator();
        while (itr.hasNext()) {
            if(itr.next() == 2){
                a1.remove(2);
                System.out.print(itr.next());
            }
        }
    }
}

//C，Exception in thread "main" java.util.ConcurrentModificationException
/*
What is the result?
A. 1 2 followed by an exception
B. 1 2 4 5
C. A ConcurrentModificationException is thrown at run time.
D. 1 2 3 followed by an exception
*/