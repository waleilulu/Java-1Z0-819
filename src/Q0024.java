import java.util.function.BiFunction;

public class Q0024<T> {
    final BiFunction<T, T, Boolean> validator;
    T left = null;  
    T right = null; 

    private Q0024() {
        validator = null;
    }

    Q0024(BiFunction<T, T, Boolean> v, T x, T y) {
        validator = v;
        set(x, y);
    }

    void set(T x, T y) {
        if (!validator.apply(x, y))
            throw new IllegalArgumentException();
        setLeft(x);
        setRight(y);
    }

    void setLeft(T x) {
        left = x;
    }

    void setRight(T y) {
        right = y; 
    }

    final boolean isValid() {
        return validator.apply(left, right);
    }
}

class Pair {
    public static void main(String[] args) {
        testPair("Hello", "World");  // 測試合法情況
        //testPair(null, "World");      // 測試不合法情況
    }

    private static void testPair(String left, String right) {
        try {
            Q0024<String> p = new Q0024<>((a, b) -> a != null && b != null, left, right);
            System.out.println("Is valid: " + p.isValid());
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException as expected for invalid input."); // 應該印出這條信息
        }
    }
}





/*
It is required that if p instanceof Pair then p.isValid() returns true.
Which is the smallest set of visibility changes to insure this requirement is met?
A. left, right, setLeft, and setRight must be private.
B. setLeft and setRight must be protected.
C. left and right must be private.
D. isValid must be public.
*/
