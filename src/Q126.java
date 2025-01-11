public class Q126 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread());
        Thread t2 = new Thread(new MyThread());
        Thread t3 = new Thread(new MyThread());

        t1.start();
        t2.run();
        t3.start();

        t1.start(); // 這行會導致 IllegalThreadStateException
    }

    static class MyThread implements Runnable {
        public void run() {
            System.out.println("Running.");
        }
    }
}

/*
Running.
Running.
Exception in thread "main" Running.
java.lang.IllegalThreadStateException
        at java.base/java.lang.Thread.start(Thread.java:794)
        at Q126.main(Q126.java:11)
*/

//A
/*
Which one is correct?
A. An IllegalThreadStateException is thrown at runtime.
B. The compilation falls.
C. Four threads are created.
D. Three threads are created.
*/