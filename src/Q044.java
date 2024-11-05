
public class Q044 {

    // MyInterface1 是一個函式型接口，因為它只有一個抽象方法 method()
    interface MyInterface1 {
        public int method() throws Exception;

        // private 方法 pMethod 不會影響 method()，因此 MyInterface1 可以用於 Lambda 表達式
        private void pMethod() {
            /* an implementation of pMethod */
        }

        //這個接口有 一個抽象方法（method()），並且該方法 不是 private 或 static。即使有一個 private 的方法（pMethod()），它不影響 method() 方法的使用。這個接口 可以用於 Lambda 表達式。
    }

    // MyInterface2 不是函式型接口，因為它有多個抽象方法
    interface MyInterface2 {
        public static void sMethod() {
            /* an implementation of sMethod */
        }

        // private boolean equals();

        // 這個接口有 static 方法 和 private 方法，但這些方法都不是抽象方法。這意味著該接口並不包含任何符合 Lambda 表達式要求的抽象方法。
    }

    // MyInterface3 不是函式型接口，因為它有兩個抽象方法 method()
    interface MyInterface3 {
        public void method();
        public void method(String str);

        // 這個接口有 兩個抽象方法（method() 和 method(String str)），因此它不符合函式型接口的要求。Lambda 表達式只能使用一個抽象方法的接口。
    }

    // MyInterface4 不是函式型接口，因為它沒有抽象方法
    interface MyInterface4 {
        private void dMethod() {
            /* an implementation of dMethod */
        }
        //這個接口只有 一個 private 方法，這不是抽象方法，因此這個接口 無法用於 Lambda 表達式。
    }

    // MyInterface5 不是函式型接口，因為它有多個抽象方法
    interface MyInterface5 {
        public void sMethod();
        public void method(String str);

        //這個接口有 兩個抽象方法（sMethod() 和 method(String str)）。Lambda 表達式要求接口只能有 一個抽象方法，所以這個接口 無法用於 Lambda 表達式。
    }

}

class LambdaTest {
    public static void main(String[] args) {
        // 測試 MyInterface1 是否可以用於 Lambda 表達式
        Q044.MyInterface1 myInterface1 = () -> {
            return 42; // 方法返回 42，符合 method() 的返回類型 int
        };

        try {
            System.out.println(myInterface1.method()); // 輸出 42
        } catch (Exception e) {
            e.printStackTrace(); // 如果有 Exception 被丟出，這裡會處理
        }

        // 測試其他接口無法用於 Lambda 表達式
        // 因為 MyInterface2、MyInterface3、MyInterface4 和 MyInterface5 都有多個抽象方法，
        // 這會導致編譯錯誤，所以下列代碼已經註解掉

        // 以下代碼將無法編譯：

        // MyInterface2 myInterface2 = () -> {}; // 編譯錯誤：MyInterface2 不是函式型接口，因為它有多個抽象方法
        // MyInterface3 myInterface3 = (str) -> {}; // 編譯錯誤：MyInterface3 不是函式型接口，因為它有多個抽象方法
        // MyInterface4 myInterface4 = () -> {}; // 編譯錯誤：MyInterface4 不是函式型接口，因為它沒有抽象方法
        // MyInterface5 myInterface5 = (str) -> {}; // 編譯錯誤：MyInterface5 不是函式型接口，因為它有多個抽象方法
    }
}

/*
Which two interfaces can be used in lambda expressions? (Choose two.)
A. MyInterface4
B. MyInterface5
C. MyInterface1
D. MyInterface3
E. MyInterface2
*/

/*
Lambda 表達式的要求：
必須是函式型接口：接口中只能有 一個抽象方法。
抽象方法 不能是 private 或 static，因為 Lambda 表達式無法覆寫這些方法。
其他的 default 或 static 方法不會影響是否可以使用 Lambda 表達式。
*/