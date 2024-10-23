public class Q007 {
    public static void main(String[] args) {
        // A. int[][][] e = {{1,1,1},{2,2,2}}; // 這將會出錯
        // B. short sh = (short) 'A'; // 正確
        // C. float x = 1f; // 正確
        // D. byte b = 10; char c = b; // 這將會出錯
        // E. String contact# = "(+2) (999) (232)"; // 這將會出錯
        // F. int x = 12_34; // 正確
        // G. boolean false = (4 != 4); // 這將會出錯

        // 測試正確的初始化
        short sh = (short) 'A';
        System.out.println("Short value: " + sh); // Short value: 65

        float x = 1f; //小數點後一位
        System.out.println("Float value: " + x); // Float value: 1.0

        int x1 = 12_34; // 可以將變量名稱改為 x1，因為 x 之前已經被使用
        System.out.println("Integer value: " + x1); // Integer value: 1234
    }
}
