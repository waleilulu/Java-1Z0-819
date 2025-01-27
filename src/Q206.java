public class Q206 {
    public static void main(String[] args) {
        String s = "Oracle";
        // final String s = "Oracle";

        Runnable r = () -> {
            System.out.println(s); 
        };
        s = "Java"; // 上方s改成final String，然後這行註解掉就可以編譯
        Thread t = new Thread(r);
        t.start();
    }
}

//D，Error: Unresolved compilation problem: Local variable s defined in an enclosing scope must be final or effectively final
/*
What is the result?
A. Oracle
B. An exception is thrown at run time.
C. Java
D. Compilation error
*/