import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Q132 {
    
    public static void main(String[] args) {
        //A
        //var locA = Arrays.of("UK", "US", "ES"); //Arrays 類別中沒有 of 方法，因此這行程式碼是無效的。
        //B
        var locB = List.of("UK", "US");
        //C
        var locC = List.of("UK", null, "US"); //List.of 方法不允許 null 值，因此這行程式碼會拋出 NullPointerException，是無效的。
        //D
        var locD = Map.of("UK", 1, "US", 2);
        //E
        var locE = ArrayList.of("UK", "US"); //ArrayList 類別中沒有 of 方法，因此這行程式碼是無效的。
        //F
        var locF = Set.of("UK", "US", "UK"); //Set.of 方法不允許重複元素，因此這行程式碼會拋出 IllegalArgumentException，是無效的。
        //G
        var locG = Set.of("UK", "US");
    }
}

//B、D、G
/*
Which three initialization statements are valid? (Choose three.)
A. var loc = Arrays.of(“UK”, “US”, “ES”);
B. var loc = List.of(“UK”, “US”);
C. var loc = List.of(“UK”, null, “US”);
D. var loc = Map.of(“UK”, 1, “US”, 2);
E. var loc = ArrayList.of(“UK”, “US”);
F. var loc = Set.of(“UK”, “US”, “UK”);
G. var loc = Set.of(“UK”, “US”);
*/