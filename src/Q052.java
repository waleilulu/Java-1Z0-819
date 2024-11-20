public final class X { //如果要編譯過的話這裡要改成class X，就會印出HH
    private String name;

    // 提供 getter 方法來取得 name
    public String getName() {
        return name;
    }

    // 提供 setter 方法來設置 name
    public void setName(String name) {
        this.name = name;
    }

    // 覆寫 toString() 方法
    public String toString() {
        return getName();
    }
}
public class Q052 extends X {
    public Q052(String name) {
        super();  // 呼叫父類 X 的無參數建構子
        setName(name);  // 使用 setName() 方法來設置 name
    }

    public static void main(String[] args) {
        Q052 q052 = new Q052("HH");  // 直接創建 Q052 類的實例
        System.out.println(q052);  // 呼叫 toString()，將輸出 "HH"
    }
}


//D，final class該類不能有任何子類，也不能被繼承

// A. null
// B. HH
// C. Y@<>
// D. The compilation fails