package Q026.bar;

public class Bar extends Q026.Foo {
    @Override
    public void foo(int j) {
        
        //System.out.println(A);
        System.out.println(B);
        //System.out.println(C);
        //System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        //System.out.println(g);
        //System.out.println(h);
        System.out.println(j);
    }

    public static void main(String[] args) {
        Bar bar = new Bar();
        bar.foo(5); // 調用 foo 方法，傳入參數 5
    }
}
