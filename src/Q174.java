import java.util.function.IntFunction;
import java.util.stream.IntStream;
public class Q174 {

    public static void main(String[] args) {
        IntStream str = IntStream.of(2, 3, 4);
        //IntFunction<Integer> func = x -> y -> x * y; // line 6
        IntFunction<Integer> func = x -> x * 10;

        //str.map(func.apply(10)).forEach(System.out::println);
        str.map(func::apply) // 使用 func.apply 來轉換每個元素
           .forEach(System.out::println); // 20 30 40
    }
}

//沒有符合的，需要改成以上才能執行
/*
Which action will enable the code to compile?
A. Replace line 6 with BiFunction func = x -> y -> x * y;
B. Replace line 6 with Function func = x -> y -> x * y;
C. Replace line 6 with IntFunction func = x -> y -> x * y;
D. Replace line 6 with IntFunction func = x -> y -> x * y;
*/
