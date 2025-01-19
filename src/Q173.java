public class Q173 {
    var a = true; // line 1
    //boolean a = true; // 改成這樣就可以執行
    {
        final var b = 10; // line 2
    }
    public static void main(String[] args) {
        int var = 100;
        var b = "100";
        System.out.println(b);
    }
}


//C
/*
Which statement is true?
A. The code prints 10.
B. The code fails to compile at line n2.
C. The code fails to compile at line n1.
D. The code fails to compile at line n4.
E. The code fails to compile at line n3.
F. The code prints 100.
*/