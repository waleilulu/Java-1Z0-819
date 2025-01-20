public class Q184 {
    public static void main(String[] args) {
        int i = 0;
        for(; i<10; i++){
            System.out.print(++i + " ");
        }
    }
}
/*
初始值：i = 0
第一次迴圈：++i 使 i 變為 1，打印 1，然後 i++ 使 i 變為 2。
第二次迴圈：++i 使 i 變為 3，打印 3，然後 i++ 使 i 變為 4。
第三次迴圈：++i 使 i 變為 5，打印 5，然後 i++ 使 i 變為 6。
第四次迴圈：++i 使 i 變為 7，打印 7，然後 i++ 使 i 變為 8。
第五次迴圈：++i 使 i 變為 9，打印 9，然後 i++ 使 i 變為 10。
當 i 變為 10 時，迴圈條件 i < 10 不再成立，迴圈結束。
*/


//D
/*
What is the result?
A. 2 4 6 8
B. 2 4 6 8 10
C. 1 3 5 7 9 11
D. 1 3 5 7 9
*/