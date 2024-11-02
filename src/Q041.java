import java.util.function.Function;

public class Q041 {
    public void foo(Function<Integer, String> fun) {
        // 可以在這裡使用 fun，例如：
        System.out.println(fun.apply(255)); // 將顯示十六進制字符串
    }

    public static void main(String[] args) {
        Q041 example = new Q041();

        int number = 255;
        String hexString = Integer.toHexString(number);
        System.out.println("將整數轉換為十六進制字符串表示: " + hexString);


        // 選擇 A: 使用 lambda 表達式
        example.foo(n -> Integer.toHexString(n)); //呼叫foo的方法

        // 選擇 F: 使用方法引用
        example.foo(Integer::toHexString); //呼叫foo的方法

        // 選擇 B: 對於這個選項不會編譯，因為 toHexString 不是一個 Function
        // example.foo(toHexString); // B

        // 選擇 C: 這個選項不會編譯，因為返回類型不是 String
        // example.foo(n -> n + 1); // C

        // 選擇 D: 這個選項不會編譯，因為語法錯誤
        // example.foo(int n -> Integer.toHexString(n)); // D

        // 選擇 E: 這個選項不會編譯，因為方法引用不符合 Function 的簽名
        // example.foo(n -> Integer::toHexString); // E

        // 選擇 G: 這個選項不會編譯，因為 n::toHexString 語法錯誤
        // example.foo(n::toHexString); // G

        // 選擇 H: 這個選項不會編譯，因為語法錯誤
        // example.foo((int n) -> Integer.toHexString(n)); // H
    }
}

/*
這段程式碼主要考察 Java 中的 函數式介面 和 lambda 表達式 的使用。具體來說，這段代碼的目的在於測試對 Function<Integer, String> 這個函數式介面的理解，以及如何使用 lambda 表達式和方法引用來匹配這個介面的要求。

主要考點：
函數式介面：

Function<Integer, String> 是一個接受一個 Integer 參數並返回 String 的函數式介面。理解如何定義和使用函數式介面是 Java 8 引入的功能之一。
Lambda 表達式：

使用 lambda 表達式（如 n -> Integer.toHexString(n)）來實現 Function 介面的方法。這考察了對 lambda 語法的熟悉程度。
方法引用：

使用方法引用（如 Integer::toHexString）來實現 Function 介面，這是 Java 中另一種更簡潔的語法來表示函數式介面。
編譯錯誤的識別：

評估不正確的選項並理解為什麼它們無法編譯。選項 B、C、D、E、G 和 H 都提供了示範性錯誤，考察你對 Java 語法和類型系統的理解
*/