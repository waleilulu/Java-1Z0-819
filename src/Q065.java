import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Foo {
    public void foo(Collection arg){
        System.out.println("Bonjour le monde!");
    }
}

class Bar extends Foo {
    public void foo(Collection arg){
        System.out.println("Hello world!");
    }
    public void foo(List arg){
        System.out.println("Hola Mundo!");
    }
}

public class Q065 {
    public static void main(String[] args) {
        // 創建 Q065 和 Bar 類的實例
        Foo f1 = new Foo();
        Foo f2 = new Bar();
        Bar b1 = new Bar();

         // 創建一個 List 並加入元素
         List<String> li = new ArrayList<>();
         li.add("Item 1");
 
         // 呼叫 f1 的 foo(Collection<?>) 方法
         f1.foo(li);  // 輸出: Bonjour le monde!
 
         // 呼叫 f2 的 foo(Collection<?>) 方法，實際上會呼叫 Bar 類的 foo(Collection<?>) 方法
         f2.foo(li);  // 輸出: Hello world!
 
         // 呼叫 b1 的 foo(List<?>) 方法
         b1.foo(li);  // 輸出: Hola Mundo!
    }
}

//DEH
/*
Which three are correct? (Choose three.)
A. f2.foo(li) prints Hola Mundo!
B. b1.foo(li) prints Bonjour le monde!
C. b1.foo(li) prints Hello world!
D. f1.foo(li) prints Bonjour le monde!
E. f2.foo(li) prints Hello world!
F. f2.foo(li) prints Bonjour le monde!
G. f1.foo(li) prints Hola Mundo!
H. b1.foo(li) prints Hola Mundo!
I. f1.foo(li) prints Hello world!
*/


/*
f1.foo(li) 呼叫的是 Foo 類中的 foo(Collection arg) 方法，因為 f1 是 Foo 類的對象，並且 Foo 類中的 foo(Collection arg) 方法最匹配。
f2.foo(li) 呼叫的是 Bar 類中的 foo(Collection arg) 方法，雖然 f2 是 Foo 類型，但它實際上指向 Bar 類的對象，所以 Bar 類中的 foo(Collection arg) 方法會被選擇。
b1.foo(li) 呼叫的是 Bar 類中的 foo(List arg) 方法，因為 b1 是 Bar 類的對象，並且參數是 List 類型。
*/