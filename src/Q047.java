public class Q047 {
    //static class Super { //A. 將 Super 類設為靜態類
    class Super {
        final int num; // line n1
        // num 被標註為 final，表示它只能被初始化一次，並且在之後不能改變其值。

        public Super(int num) {
            this.num = num;
        }

        final void method() { // 當 final 用於方法上時，表示該方法不能被子類繼承並重寫（覆蓋）。換句話說，父類提供的實現將始終被使用，子類無法修改這個方法的行為。
            System.out.println("Output from Super");
        }
    }

    class Sub extends Super {
        int num; // line n2

        Sub(short num) { // line n3
            super(num); // 使用 super(num) 呼叫父類 Super
        }

        // protected void method() { // line n4
        //     System.out.println("Output from Sub");
        // }
    }
    public static void main(String[] args) {
        // //A. 可以直接在 main 方法中創建。
        // Super test = new Super(10); 
        // test.method();

        // B. 創建 Sub 類的實例，然後調用繼承自 Super 類的 method 方法
        Sub subInstance = new Q047().new Sub((short) 10);
        subInstance.method();  // 輸出: Output from Super
    }
}

/*
final 變數：使得變數不能被重新賦值。
final 方法：使得該方法不能被子類重寫。
*/

/*
Which line of code results in a compilation error?
A. line n1
B. line n3
C. line n2
D. line n4 答案是D.
 */
