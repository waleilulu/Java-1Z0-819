public class Q085 {

    interface Pastry {
        void getIngredients();
    }

    abstract class Cookie implements Pastry {
        // Cookie 類可以有其他功能或變數
    }

    //class ChocolateCookie implements Cookie { //不用implements
    class ChocolateCookie extends Cookie {     // ChocolateCookie 類應該是繼承 Cookie 類，因為 Cookie 是一個具體類（非介面），並且 ChocolateCookie 需要繼承 Cookie 中的一些屬性或方法。
        @Override
        public void getIngredients() {
            // 這裡可以實作 ChocolateCookie 特有的 getIngredients 方法
        }
    }
    
    class CoconutChocolateCookie extends ChocolateCookie {
        // 重寫 getIngredients 方法並加上參數
        void getIngredients(int x) {

        }
    }

    public static void main(String[] args) {
        // 在這裡可以創建對象並測試功能
        Q085 obj = new Q085();
        ChocolateCookie chocolateCookie = obj.new ChocolateCookie();
        chocolateCookie.getIngredients();
    }
}


//A
/*
01. interface Pastry {
02. void getIngredients();
03. }
04. abstract class Cookie implements Pastry { }
05.
06. class ChocolateCookie implements Cookie {
07. public void getIngredients() { }
08. }
09. class CoconutChocolateCookie extends ChocolateCookie {
10. void getIngredients(int x) { }
11. }

Which is true?
A. The compilation fails due to an error in line 6.
B. The compilation succeeds.
C. The compilation fails due to an error in line 4.
D. The compilation fails due to an error in line 10.
E. The compilation fails due to an error in line 7.
F. The compilation fails due to an error in line 9.
G. The compilation fails due to an error in line 2.
*/