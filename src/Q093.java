public class Q093 {
    public static void main(String[] args) {
        int i = 3;
        int j = 25;
        System.out.println(i > 2 ? i > 10 ? i * (j + 10) : i * j + 5 : 1); //80   
    }
}

//D
/*
What is the result?
A. 385
B. 3
C. The compilation fails.
D. 80
E. 25
*/
/*
1. i > 2 ? ... : ... 的條件運算符：
i = 3，這裡 i > 2 會返回 true，因此會選擇冒號 : 右邊的部分，即 i > 10 ? i * (j + 10) : i * j + 5。

2. 進一步解析 i > 10 ? i * (j + 10) : i * j + 5：
由於 i = 3，所以 i > 10 返回 false，因此會選擇 i * j + 5 這個選項。

3. 計算 i * j + 5：
i = 3，j = 25，所以 i * j = 3 * 25 = 75。
然後加上 5，得到 75 + 5 = 80。
*/