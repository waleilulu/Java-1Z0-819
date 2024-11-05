// Q043.java
interface APIInterface {
    // 預設方法，實現了一個簡單的 process
    default void process() {
        System.out.println("Process() called 1.");
    }
}

abstract class AbstractAPI {
    // 抽象方法 process，要求子類必須實現
    public abstract void process();
}

class ApiImpl extends AbstractAPI implements APIInterface {
    // 覆寫 process 方法
    public void process() {
        System.out.println("Process() called 2.");
    }
}

// 主程式
public class Q043 {
    public static void main(String[] args) {
        var impl = new ApiImpl();
        impl.process();  // 呼叫 process 方法，應該輸出 "Process() called 2."
        //雖然 APIInterface 中有一個 default 方法 process()，但是由於 ApiImpl 類別覆寫了 AbstractAPI 中的抽象方法 process()，它的這個具體實現會被執行，並且完全取代 APIInterface 中的 default 實現。
    }
}

//Process() called 2.
/*
總結：
抽象方法的優先順序：當一個類別同時繼承抽象類別並實作介面，並且介面有 default 方法時，抽象方法的覆寫優先於 default 方法。
由於 ApiImpl 覆寫了 AbstractAPI 中的抽象方法，這個具體實現會被執行，而 APIInterface 中的 default 方法不會被調用。
*/