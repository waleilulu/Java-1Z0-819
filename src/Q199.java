class Test{ // 類別 Test 定義了兩個重載方法 display
    void display(int y){
        System.out.println("one"); // 接收一個整數參數，並輸出 "one"。
    }
    void display(long l){
        System.out.println("two"); // 接收一個長整數參數，並輸出 "two"。

    }
}
public class Q199 {
    public static void main(String[] args) {
        new Test().display(0B1010_0101_1001_0110); // 主方法中，呼叫 new Test().display(0B1010_0101_1001_0110)。
        /*
        0B1010_0101_1001_0110 是一個二進位常數，這是 Java 中的數字表示法。前綴 0B 表示該數字為二進位。
        此二進位值對應的十進位為 42454。
        它的型別是 int，因為 Java 中整數常數的預設型別為 int。
        */
    }
}

//C
/*
What is the result?
A. two
B. The compilation fails
C. one
D. A NumberFormatExcpetion is thrown at runtime.
*/