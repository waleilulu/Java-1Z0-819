public class Q005 {
    public static void main(String[] args) {
        for (var i = 0; i < 10; i++) {

            switch (i % 5) {
                case 2:
                    i *= 2 * i;
                    break;

                case 3:
                    i++;
                    break;

                case 1: //因為 case 1 沒有 break 語句，會繼續執行到 case 4 的部分
                case 4:
                    i++;
                    continue;

                default:
                    break;
            }
            System.out.print(i + " ");
            i++;
        }
    }
}

/*
迭代 1 (i = 0)：

i % 5 為 0 → 默認情況 → 輸出 0，然後將 i 增加到 1。
迭代 2 (i = 1)：

i % 5 為 1 → 案例 1（落到案例 4）→ 將 i 增加到 2（沒有輸出）。
迭代 3 (i = 2)：

i % 5 為 2 → 案例 2 → i 變成 8（2 * 2 * 2）→ 輸出 8，然後將 i 增加到 9。
迭代 4 (i = 9)：

i % 5 為 4 → 案例 4（從案例 1 落到）→ 將 i 增加到 10（沒有輸出）。
 */