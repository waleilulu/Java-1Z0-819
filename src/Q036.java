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
        System.out.println("第一步驟: " + sb); // 0).D,|1).i,|2).a,
        System.out.println("字串長度: " + sb.length()); //17
        
        sb.delete(sb.length() - 2, sb.length() - 1); //delete 方法，delete(int start, int end) 方法會刪除從 start 位置到 end 位置（不包括 end 位置）的所有字符。
        // 刪除(17-2=15, 17-1=16) => (序號15, 序號16)，只刪15不刪16，序號15是a
        System.out.println("第二步驟: " + sb); // 0).D,|1).i,|2).,

        System.out.println("字串長度: " + sb.length()); //16
        sb.insert(0, '[').insert(sb.length() - 1, ']'); //在序號0加上[，[變成0).D,|1).i,|2).,，在序號16-1=15地方加上]
        System.out.println("最後輸出: " + sb); //[0).D,|1).i,|2).],
    }
}

//[0).D|1).i|2).i]