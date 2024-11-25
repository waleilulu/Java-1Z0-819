public class Q053 {
    static int myint = 666;
    public static void main(String[] args) {
        int myint = myint; //The local variable myint may not have been initialized，在這裡，myint 是一個局部變數（在 main 方法中宣告的），而且你正在嘗試將這個局部變數初始化為它自己（myint = myint）。但在此時，myint 並未被賦值，因此 Java 編譯器無法確定它的值，並且會報告這個錯誤。
        //int myint = Q053.myint; //寫成這樣就會編譯過
        System.out.println(myint);
    }
}

//D

// Which is true?
// A. Code compiles but throws a runtime exception when run.
// B. It prints 666.
// C. The code compiles and runs successfully but with a wrong answer (i.e., a bug).
// D. The code does not compile successfully.