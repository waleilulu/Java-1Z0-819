public class Q036 {
    public static void main(String[] args) {
        String[] furnitures = { "Door", "Window", "Chair" };
        var sb = new StringBuilder();
        for (var i = 0; i < furnitures.length; i++) {
            var index = i + 1;
            sb.append(i)
                    .append(").")
                    .append(furnitures[i].charAt(i))
                    .append(",");
            if (index < furnitures.length) {
                sb.append("|");
            }
        }
        sb.delete(sb.length() - 2, sb.length() - 1);
        sb.insert(0, '[').insert(sb.length() - 1, ']');
        System.out.println(sb);
    }
}

//[0).D|1).i|2).i]

/*
宣告和初始化：

宣告一個 String 陣列 furnitures，包含 "Door"、"Window" 和 "Chair"。
宣告一個 StringBuilder 物件 sb，用於累積字符串。
進入 for 循環：

循環從 i = 0 開始，直到 i 小於 furnitures.length（即 3）。
第一輪 (i = 0)：

index 設定為 1（i + 1）。
將 0).D 附加到 sb。
由於 index（1）小於 furnitures.length（3），因此附加一個 |。
第二輪 (i = 1)：

index 設定為 2。
將 1).i 附加到 sb。
index（2）仍然小於 furnitures.length（3），因此附加一個 |。
第三輪 (i = 2)：

index 設定為 3。
將 2).i 附加到 sb。
此時 index（3）不小於 furnitures.length（3），所以不再附加 |。
結束循環：

循環結束後，sb 的內容為 0).D,|1).i,|2).i,（最後有一個多餘的逗號和管道符號）。
刪除最後的多餘字符：

使用 sb.delete(sb.length() - 2, sb.length() - 1) 來移除最後的逗號。
包裝成陣列格式：

使用 sb.insert(0, '[').insert(sb.length() - 1, ']') 來將結果包裝在 [ 和 ] 之間。
輸出結果：

使用 System.out.println(sb) 輸出最終結果。 
*/