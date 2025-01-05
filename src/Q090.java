import java.util.Collection;

public class Q090 {
    public class X {
        protected void print(Object obj) {
            System.out.println(obj);
        }
    
        public final void print(Object... objects) {
            for (Object object: objects) {
                print(object);
            }
        }

        public void print(Collection collection) {
            collection.forEach(System.out::println);
        }
    }

    public class Y extends X {
        protected void print(Object obj) {
                System.out.println("[" + obj + "]");
            }
            public final void print(Object... objects) { //因為父類的 print(Object...) 方法被標註為 final，所以子類 Y 無法重寫這個方法，導致編譯錯誤。
            for (Object object: objects) {
                System.out.println("[" + object + "]");
                }
            }
            public void print(Collection collection) {
                print(collection.toArray());
            }
}

//D
/*
Why does this compilation fail?
A. The method X.print (object) is not accessible to Y.
B. The method Y.print (Object) does not call the method super.print (Object).
C. In method X.print (Collection), System.out::println is an invalid Java identifier.
D. The method Y.print (Object...) cannot override the final method X.print (Object...).
E. The method print (Object) and the method print (Object...) are duplicates of each other.
*/