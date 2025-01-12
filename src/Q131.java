import java.util.HashMap;

public class Q131 {
    public static void main(String[] args) {
        var h = new HashMap();
        String[] k = {"1", "2", null, "3"};
        String[] v = {"a", "b", "c", "null"};

        for (int i = 0; i < 4; i++ ){
            h.put(k[i], v[i]);
            System.out.print(h.get(k[i]) + " "); //a b c null 
        }
    }
}
//B
/*
What is the result?
A. a b c followed by an exception
B. a b c null
C. a b c
D. a b followed by an exception
*/