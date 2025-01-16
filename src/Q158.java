class Sports {
    public double getRatings(){
        // 父類別的方法應該有實現，這裡假設返回一個預設值
        return 0.0;
    }
}
public class Q158 extends Sports {
    public double getRatings() {
        // 子類別的方法覆寫父類別的方法
        return super.getRatings() + 1.0; // 假設子類別在父類別的基礎上增加一些邏輯
    }
    public static void main(String[] args) {
        Q158 football = new Q158();
        System.out.println(football.getRatings()); // 應該輸出 1.0
    }
}


//D
/*
Which is the correct implementation of the getRatings method in the Football subclass?
A. The subclass getRatings method uses public.getRatings() to call the base class method but uses its own named fields in the
implementation.
B. The subclass getRatings method implementation directly accesses the fields in the Sports superclass.
C. The subclass getRatings method uses new.getRatings() to call the base class method but uses its own named fields in the implementation.
D. The subclass getRatings method uses super.getRatings() to call the base class method but uses its own named fields in the
implementation.
*/