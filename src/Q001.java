public class Q001 {
    public static void main(String[] args) {
        int x = 0, y = 6;
        for (; x < y; x++, y--) { // ;意思為: 初始化部分被省略
            if (x % 2 == 0) {
                continue; // 如果符合，符合那個的x會跳掉
            }
            System.out.println(x + "-" + y);
        }
    }
}

/*
 * 第一次 x=0, y=6，x < y 為真，進到for裡面 0 % 2 == 0 為真，執行 continue，跳出不印
 * System.out.println
 * 第二次 x=0+1=1, y=6-1=5，進到for裡面 1 % 2 == 0 為假，所以不執行 continue，印出1-5
 * 第三次 x=1+1=2, y=5-1=4，進到for裡面 2 % 2 == 0 為真，執行 continue，跳出不印
 * System.out.println
 * 第四次 x=2+1=3, y=4-1=3，x=y不符合條件，不執行
 */