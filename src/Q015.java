import java.util.List;

public class Q015 {
    public static void main(String[] args) {
        List<Integer> list = List.of(11, 12, 13, 12, 13);

        // A. 
        //Double d = list.get(0); // 編譯錯誤
        /*需改成以下*/
        Double d1 = (double) list.get(0); // 強制類型轉換
        Double d2 = Double.valueOf(list.get(0)); // 將 Integer 轉換為 Double

        // B. 
        double f = list.get(0);

        // C. 
        Integer a = Integer.valueOf(list.get(0));

        // D. 
        Integer b = list.get(0);


        // E. 
        int c = list.get(0); 

        //F.
        Double e = Double.valueOf(list.get(0)); 


        // 輸出測試結果
        System.out.println("d = " + d1);
        System.out.println("d = " + d2);
        System.out.println("f = " + f);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("e = " + e);
    }
}
