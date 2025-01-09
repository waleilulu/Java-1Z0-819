class ConSuper{
    protected ConSuper(){ //3. 執行 ConSuper() 的構造函數
        this(2); //4. ConSuper() 的第一行是 this(2)，這會調用 ConSuper(int a) 構造函數，並傳遞參數 2
        System.out.print("3"); //6. 再回來執行這行，印出3
    }
    protected ConSuper(int a){ 
        System.out.print(a); //5. 把2傳進來，印出2
    }
}
public class Q112 extends ConSuper{
    Q112(){
        this(4);
        System.out.print("1");
    }
    Q112(int a){ //2. 呼叫父類 ConSuper 的構造函數
        System.out.print(a); //1. 呼叫Q112(int a)，印出 4
    }
    public static void main(String[] args) {
        new Q112(4);
    }
}

//C
/*
What is the result?
A. 214
B. 2341
C. 234
D. 2134
*/