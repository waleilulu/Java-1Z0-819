import java.util.function.BiPredicate;

public class Q022 {
    public static void main(String[] args) {
        // 測試選項 A
        // BiPredicate<Integer, Integer> test = (final Integer x, var y) -> (x.equals(y)); //final Integer x 明確指定了第一個參數的類型為 Integer。第二個參數 var y 使用了 var，這意味著 Java 會自動推斷類型，但在 Lambda 表達式中，var 不能與已指定類型的參數共存。

        // // 測試選項 B
        BiPredicate<Integer, Integer> testB = (var x, final var y) -> (x.equals(y));
        System.out.println("Test C (5, 5): " + testB.test(5, 5)); // 應輸出 true
        System.out.println("Test C (5, 3): " + testB.test(5, 3)); // 應輸出 false

        // // 測試選項 C
        // BiPredicate<Integer, Integer> testC = (Integer x, final var y) -> (x.equals(y)); //如果你想使用 var，所有參數都必須是 var。如果你使用明確的類型，所有參數都應明確指定類型。
        // System.out.println("Test C (5, 5): " + testC.test(5, 5)); // 應輸出 true
        // System.out.println("Test C (5, 3): " + testC.test(5, 3)); // 應輸出 false

        // // 測試選項 D
        // BiPredicate<Integer, Integer> testD = (final var x, y) -> (x.equals(y)); //var 不能與明確類型混合使用，所有參數必須一致。如果你希望使用 var，所有參數都必須用 var，如果你使用具體類型，則所有參數必須明確指定類型。

        // // 測試選項 E
        BiPredicate<Integer, Integer> testE = (Integer x, final Integer y) -> (x.equals(y));
        System.out.println("Test E (10, 10): " + testE.test(10, 10)); // 應輸出 true
        System.out.println("Test E (10, 5): " + testE.test(10, 5)); // 應輸出 false
    }
}
