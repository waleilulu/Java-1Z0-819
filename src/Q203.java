public class Q203 {
    public static void main(String[] args) {
        final MyResource res1 = new MyResource();
        MyResource res2 = new MyResource();

        try (res1, res2){ // try-with-resources 資源聲明規則：必須在 try 語句內聲明新的資源變量，不能直接使用外部變量。即便是 final，也不能直接使用。
        
        // 改成以下就會編譯過
        //try (MyResource r1 = res1; MyResource r2 = res2) {
            //do something
        } catch (Exception e) {

        }
    }
    static class MyResource implements AutoCloseable{
        public void close() throws Exception{

        }
    }
}


// C
/*
Which statement is true?
A. The code compiles successfully.
B. The code fails to compile as MyResource must implement Closeable.
C. The code fails to compile as try-with-resource needs a variable declaration such as MyResource r1 = res1; MyResource r2 = res2;.
D. The code fails to compile as res2 should be declared as final.
*/