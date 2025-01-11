import java.time.LocalDate;

public class Q120 {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.now(); // 創建一個新的 LocalDate 物件
        d1 = d1.plusDays(1); // 創建一個新的 LocalDate 物件
        d1 = d1.minusMonths(2); // 創建一個新的 LocalDate 物件

        LocalDate d2 = d1.plusWeeks(3); // 創建一個新的 LocalDate 物件
        d2 = d2.minusDays(4); // 創建一個新的 LocalDate 物件
        d2 = null; // 不創建新的 LocalDate 物件，只是將 d2 設為 null
    }
}

//D，共創建 5 個 LocalDate 物件。
/*
How many LocalDate objects are created in this example?
A. 2
B. 3
C. 4
D. 5
*/