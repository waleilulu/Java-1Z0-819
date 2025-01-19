public class Q172 {
    public static void main(String[] args) {
        int sum = 0, x = 0;
        for(;x < 3; sum += ++x); // line 1
        System.out.print("-" + sum); //-6
    }
}

/*
初始時，sum = 0 和 x = 0。

第一次迴圈：
x = 0，x < 3，符合條件，進入迴圈。
++x 會將 x 從 0 增加到 1，然後 sum += 1，此時 sum = 1，x = 1。

第二次迴圈：
x = 1，x < 3，仍然符合條件，進入迴圈。
++x 會將 x 從 1 增加到 2，然後 sum += 2，此時 sum = 3，x = 2。

第三次迴圈：
x = 2，x < 3，仍然符合條件，進入迴圈。
++x 會將 x 從 2 增加到 3，然後 sum += 3，此時 sum = 6，x = 3。

第四次迴圈：
x = 3，此時 x >= 3，不符合條件，迴圈結束。
*/



//A
/*
What is the result?
A. -6
B. -0-1-3-6
C. The compilation fails due to an error in line 1.
D. -0-1-3
*/