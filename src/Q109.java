public class Q109 {
    //To secure this code, you want to make sure that the client code cannot modify the public static fields.
    // class Separators{
    //     public static String separator = "/";
    //     public static String pathSeparator = ":";
    // }

    //A，數值會被修改
    // abstract class Separators{
    //     public static String separator = "/";
    //     public static String pathSeparator = ":";
    // }
    // public static void main(String[] args) {
    //     // 直接修改 separator 的值
    //     Separators.separator = "123";  // 這是合法的，會成功執行
    //     System.out.println(Separators.separator);  // 輸出 "123"
    // }

    //B (枚舉) 
    // enum Separators{
    //     separator,
    //     pathSeparator
    // }
    // public static void main(String[] args) {
    //     // 直接修改枚舉成員，這會引發編譯錯誤
    //     //Separators.separator = ":";  // 編譯錯誤
    //     // 可以安全地讀取枚舉的值，但無法修改
    //     System.out.println(Separators.separator);
    // }

    //C (介面)
    interface Separators{
        String separator = "/";
        String pathSeparator = ":";
    }
    public static void main(String[] args) {
        // 嘗試修改介面中的常量，這會引發編譯錯誤
        //Separators.separator = "1234";  // 編譯錯誤
         // 可以安全地讀取常量，但無法修改
         System.out.println(Separators.separator); 
    }

    //D
    // class Separators{
    //     // private static String separator = "/";
    //     // private static String pathSeparator = ":";
    // }
    // public static void main(String[] args) {
    //     Separators.separator = "1234";
    //     System.out.println(Separators.separator);
    // }

}
//C，但測試B也可以
/*
選項 B (枚舉) 和 選項 C (介面) 都能有效保護靜態欄位，使它們無法被修改。
在 B 中，枚舉成員會被視為 public static final，因此無法重新賦值。
在 C 中，介面中的靜態常量也是 public static final，並且同樣無法修改。
這兩種方法都能保證這些欄位不可修改，並且可以從外部安全地訪問它們。
*/