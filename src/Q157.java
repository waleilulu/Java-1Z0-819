abstract class Base{
    abstract protected float getVal();
}

public class Q157 extends Base{
    //在 Q157 類別中，存在兩個 getVal() 方法，一個返回 float，一個返回 long。這樣的情況下，編譯器無法確定要調用哪個方法，因此會拋出編譯時錯誤。
    public float getVal(){
        return 0f;
    }

    //取消long getVal()方法，就會印出0.0
    // public long getVal(){
    //     return 2L;
    // }
    public static void main(String[] args) {
        Q157 test = new Q157();
        float f = test.getVal();
        System.out.println(f + test.getVal());
    }
}


//C
/*
What is the output?
A. 2.0
B. 2
C. The compilation fails.
D. An exception is thrown at runtime.
*/