import java.util.function.BiPredicate;

public class Q204 {
    public static void main(String[] args) {
        // A. 這一行會編譯錯誤，因為無法將 `final` 和 `var` 混合使用
        // BiPredicate<Integer, Integer> testA = (Integer x, final var y) -> (x.equals(y)); // 編譯錯誤

        // B. 這一行會編譯成功，因為 `x` 和 `y` 顯式聲明為 `Integer`，並且 `y` 被標註為 `final`
        BiPredicate<Integer, Integer> testB = (Integer x, final Integer y) -> (x.equals(y));
        System.out.println(testB.test(1, 1)); // 應該會輸出 true，因為兩者相等

        // C. 這一行會編譯成功，因為 `x` 和 `y` 都使用了 `var`，並且 `y` 被標註為 `final`
        BiPredicate<Integer, Integer> testC = (var x, final var y) -> (x.equals(y));
        System.out.println(testC.test(1, 1)); // 應該會輸出 true，因為兩者相等

        // D. 這一行會編譯錯誤，因為混合使用了 `final` 和 `var` 於不同的參數中
        // BiPredicate<Integer, Integer> testD = (final Integer x, var y) -> (x.equals(y)); // 編譯錯誤

        // E. 這一行會編譯錯誤，因為第二個參數 `y` 沒有使用 `var`，這樣會導致語法錯誤
        // BiPredicate<Integer, Integer> testE = (final var x, y) -> (x.equals(y)); // 編譯錯誤
    }
}


// 與Q022.java類似

// B、C
/*
Which two are valid statements? (Choose two.)
A. BiPredicate test = (Integer x, final var y) -> (x.equals(y));
B. BiPredicate test = (Integer x, final Integer y) -> (x.equals(y))
C. BiPredicate test = (var x, final var y) -> (x.equals(y));
D. BiPredicate test = (final Integer x, var y) -> (x.equals(y));
E. BiPredicate test = (final var x, y) -> (x.equals(y));
*/