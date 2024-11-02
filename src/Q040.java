public class Q040 {
    public static void main(String[] args) {
        char d = 100, e = 'e'; // line 1
        int x = d; // line 2
        // int = y = (int) e; // line 3，E. 明顯錯誤無法編譯

        //如果要編一過就要改成
        int y = (int) e; //e 的整數值（即其 ASCII 值或 Unicode 值）是 101
        System.out.println((int) e); //101
        System.out.println((char) x + (char) y); // 100+101=201
    }
}

/*
What is the result?
A. The compilation fails due to an error in line 2.
B. 201
C. de
D. 203
E. The compilation fails due to an error in line 3.
F. The compilation fails due to an error in line 1.
*/

/*這道題目主要考察對於 Java 的字符和整數之間的轉換以及代碼的正確性。 */