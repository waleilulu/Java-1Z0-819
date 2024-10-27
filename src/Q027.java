import java.util.Comparator;

public class Q027 {
    public static void main(String[] args) {
        // A
        // new Comparator<String>(){
        // public int compareTo(String str1, String str2){
        // return str1.compareTo(str2);
        // }
        // }

        // B
        // public class Comps implements Comparator {
        // public int compare(String str1, String str2){
        // return str1.length() - str2.length();
        // }
        // }

        // C
        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                return str1.compareTo(str2);
            }
        };
        
        // 測試 Comparator
        String s1 = "apple";
        String s2 = "banana";

        // 使用 compare 方法
        int result = stringComparator.compare(s1, s2);
        System.out.println("Comparison result: " + result); // 這表示 "apple" 小於 "banana"，因為字母序比較的結果是-1。這樣，你就成功地將匿名Comparator 實作寫入到 Q027 類中並進行了測試。

        // D
        // public class Comps implements Comparator{
        // public boolean compare(Object obj1, Object obj2){
        // return obj1.equals(obj2);
        // }
        // }
    }
}
