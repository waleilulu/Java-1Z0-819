import java.util.Optional;

public class Q056 {
    public static void main(String[] args) {
        System.out.println("Ans: " + convert("a").get());
    }
    private static Optional<Integer>convert(String s){
        try {
            return Optional.of(Integer.parseInt(s)); 
        } catch (Exception e) {
            return Optional.empty();
        }
    }
}

//Exception in thread "main" java.util.NoSuchElementException: No value present 
//原本字串帶進去的值是"a"，a沒辦法轉數字，如果字串那邊輸入的是數字，就可以轉Integer
/*
What is the result?
A. A java.util.NoSuchElementException is thrown at run time.
B. Ans : a
C. The compilation fails.
D. Ans :
*/