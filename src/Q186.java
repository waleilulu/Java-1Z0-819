import java.util.ArrayList;
import java.util.List;


class A{}
class B extends A{}
class C extends B{}
public class Q186 {
    public static void main(String[] args) {
        List<? extends A> listA = new ArrayList<>();
        List<B> listB = new ArrayList<B>();
        List<? extends B> listC = new ArrayList<>();
        ListA = listB; // 應該寫成 listA = listB; 就可以編譯過了
        //listA = listB; 
        
        ListC = listB; // 應該寫成 listC = listB; 就可以編譯過了
        //listC = listB;
    }
}

//D
/*
Which is true?
A. The program fails to compile on line 10.
B. The program fails to compile on line 13.
C. The program fails to compile on line 11.
D. The program compiles fine.
*/