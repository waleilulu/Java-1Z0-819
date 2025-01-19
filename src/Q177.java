public class Q177 {
    public static void main(String[] args) {
        String s = "hat at store";  // 定義字串 s
        int x = s.indexOf("at"); // 查找 "at" 的位置，x=1，a在索引1的位置
        /*
        字串:  h  a  t     a  t     s  t  o  r  e
        索引:  0  1  2  3  4  5  6  7  8  9  10

        */
        s.substring(x + 3); // x=1，+3後=4，取得從 "at" 之後的子字串，但沒有被保留
        System.out.println(s.substring(4)); // 索引4後面字串為: at store
        
        x = s.indexOf("at"); // 再次查找 "at" 的位置，x=1，a在索引1的位置
        System.out.println(s + " " + x); //hat at store 1
    }
}

//A
/*
What is the result?
A. hat at store 1
B. An IndexOutOfBoundsException is thrown at runtime,
C. at once 0
D. hat at store 4
E. at once 1
*/