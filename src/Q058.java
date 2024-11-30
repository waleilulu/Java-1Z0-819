public class Q058 {
    public static void main(String[] args) {
        AnotherClass ac = new AnotherClass();
        SomeClass sc = new AnotherClass();
        ac = sc; //程式碼無法編譯的原因出在這一行
        //ac 是 AnotherClass 類型的變數，而 sc 是 SomeClass 類型的變數。Java 不允許將 SomeClass 類型的變數賦值給 AnotherClass 類型的變數。
        //或是寫成ac = (AnotherClass) sc;  // 強制轉型，將 sc 轉回 AnotherClass 類型

        sc.methodA();
        ac.methodA();
    }
}
class SomeClass{
    public void methodA(){
        System.out.println("SomeClass#methodA()");
    }
}
class AnotherClass extends SomeClass{
    public void methodA(){
        System.out.println("AnotherClass#methodA()");
    }
}

//C
/*
What is the result?
A. AnotherClass#methodA()
SomeClass#methodA()
B. A ClassCastException is thrown at runtime.
C. The compilation fails.
D. AnotherClass#methodA()
AnotherClass#methodA()
E. SomeClass#methodA()
AnotherClass#methodA()
F. SomeClass#methodA()
SomeClass#methodA()
*/