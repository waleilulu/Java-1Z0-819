import java.util.function.Supplier;

public class Q159 {
    void myLambda() {
        int i = 25;
        Supplier<Integer> foo = () -> i;
        //i++;

        //在 Lambda 表達式中使用的變數必須是事實上的 final，也就是說，這些變數在 Lambda 表達式中不能被修改。在這段程式碼中，變數 i 在 Lambda 表達式中被使用後，又被修改了 (i++)，這會導致編譯錯誤。
        //需要註解掉 i++ 才能正確編譯
        System.out.println(foo.get());
    }
    public static void main(String[] args) {
        new Q159().myLambda();
    }
}

//B
/*
Which is true?
A. The code prints 25.
B. The code does not compile.
C. The code throws an exception at runtime.
D. The code compiles but does not print any result.
*/