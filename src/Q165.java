import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Q165 {
    //使用 Java Stream API 來計算從 1 到 9999 的整數範圍的總和
    Stream<Integer>data = IntStream.range(1, 10000).boxed();
    //Integer sum = data.mapToInt(a->a).sum(); //line 1
    //A
    //Integer sum = data.map(a -> a).reduce((a, b) -> a+b);
    //B
    //OptionalInt value = data.mapToInt(a -> a).parallel().reduce(0, (a, b) -> a+b);
    //C
    //int s = 0;

    //D
    OptionalInt value = data.mapToInt(a -> a).parallel().reduce((a, b) -> a+b);

    //E
    //Integer sum = data.mapToInt(a -> a).reduce(0, (a,b)->a+b);
    public static void main(String[] args) {
        Q165 q165 = new Q165();
        System.out.println("Sum: " + q165.value);
        //System.out.println("Sum: " + q165.sum);
    }
}

//D、E
/*
Which two code fragments, independently, replace line 1 to implement the equivalent reduce operation? (Choose two.)
A. Integer sum = data.map(a -> a).reduce((a, b) -> a+b);
B. OptionalInt value = data.mapToInt(a -> a).parallel().reduce(0, (a, b) -> a+b);
Integer sum = value.getAsInt();
C. int s = 0;
Integer sum = data.map(a -> a).reduce(0, (a-> a + s));
D. OptionalInt value = data.mapToInt(a -> a).parallel().reduce((a, b) -> a+b);
Integer sum = value.getAsInt();
E. Integer sum = data.mapToInt(a -> a).reduce(0, (a,b)->a+b);
*/