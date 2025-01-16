public class Q162 {
    static String s; //由於 s 是靜態變數，且未被初始化，因此其初始值為 null。
    public static void main(String[] args) {
        // 如果要讓程式正確運行，需要將 s 初始化為一個非 null 的值，例如 s = ""。
        // if (s == null) {
        //     s = ""; // 給 s 賦一個預設值，避免 NullPointerException
        // }

        switch (s) { //當 switch 語句遇到 null 值時，會拋出 NullPointerException
            case "41":
                s += "41";
            default:
                s += "def";
            case "42":
                s += "42";
        }
        System.out.println(s); //Exception in thread "main" java.lang.NullPointerException
    }
}

//C
/*
What is the output?
A. null
B. 41 def 42
C. An exception is thrown at runtime.
D. def 42
*/