import java.util.function.Supplier;

public class Q190 {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Hello World";
        //A
        //System.out.println(supplier.apply());

        //B
        //System.out.println(supplier.accept());

        //C
        System.out.println(supplier.get()); // 輸出: Hello World

        //D
        //System.out.println(supplier.test()); 
    }


}
/*
Given the code fragment:
Supplier supplier = () -> "Hello World";
// line 1
Which statement on line 1 is calling the method of the supplier object correctly?
A. System.out.println(supplier.apply());
B. System.out.println(supplier.accept());
C. System.out.println(supplier.get());
D. System.out.println(supplier.test());    
*/
