public class Q187{

    @FunctionalInterface
    public interface BiPredicate<T, U> {
    boolean test(T t, U u); //T 代表第一個參數的類型。 U 代表第二個參數的類型。
    }
    //A
    //BiPredicate testEquality = (var x, Integer y) -> (x.equals(y));

    //B
    //BiPredicate testEquality = (var x, var y) -> (x.equals(y));
    BiPredicate<String, String> testEquality = (var x, var y) -> (x.equals(y));

    //C
    //BiPredicate testEquality = var x, var y -> (x.equals(y));

    //D
    //BiPredicate testEquality = (var x, y) -> (x.equals(y));

    public static void main(String[] args) {
        Q187 instance = new Q187();
        System.out.println(instance.testEquality.test("test", "test")); // true
    }
}

//B
/*
Which is a valid statement? 哪一個是有效的 BiPredicate 宣告。BiPredicate 是一個函數式介面，接受兩個參數並回傳一個布林值。
A. BiPredicate testEquality = (var x, Integer y) -> (x.equals(y));
B. BiPredicate testEquality = (var x, var y) -> (x.equals(y));
C. BiPredicate testEquality = var x, var y -> (x.equals(y));
D. BiPredicate testEquality = (var x, y) -> (x.equals(y));    
*/