public class Q066 {
    private final int x = 1;
    static final int y;
    public Q066(){
        System.out.print(x);
        System.out.print(y);
    }
    public static void main(String[] args) {
        new Q066();
    }
}

//E，static final int y須被初始化

/*
What is the result?
A. 10
B. 1
C. The compilation fails at line 9.
D. The compilation fails at line 16.
E. The compilation fails at line 13.
*/