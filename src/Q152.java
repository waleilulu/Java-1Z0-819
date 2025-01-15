import java.util.List;

public class Q152 {
    public static void main(String[] args) {
        List even = List.of();
        even.add(0, -1);
        even.add(0, -2);
        even.add(0, -3);

        System.out.println(even); //Exception in thread "main" java.lang.UnsupportedOperationException
    }
}

//A
/*
What is the output?
A. A runtime exception is thrown.
B. The compilation fails.
C. [-3, -2, -l]
D. [-1, -2, -3]
*/