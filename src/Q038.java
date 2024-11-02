import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Q038 {
    //private int count = 0; // line 1

    //D.
    private AtomicInteger count = new AtomicInteger(0);

    public static void main(String[] args) { // line 2
        Q038 test = new Q038();
        ExecutorService service = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            service.submit(() -> {
                for (int j = 0; j < 10000; j++) {
                    // test.count++; // line 3
                    
                    //C.
                    // synchronized (test) {
                    //     test.count++;
                    // }

                    //D.
                    test.count.incrementAndGet();
                }
            });
        }
        service.shutdown();
    }
}

/*
You must make the count variable thread safe.
Which two modifications meet your requirement? (Choose two.)
A. replace line 2 with public static synchronized void main(String[] args) {
B. replace line 1 with private volatile int count = 0;
C. replace line 3 with
synchronized(test) {
test.count++;
}
D. replace line 1 with private AtomicInteger count = new AtomicInteger(0); and replace line 3 with test.count.incrementAndGet();
E. replace line 3 with
synchronized(test.count) {
test.count++;
}
*/


 /*

這道考題主要在考察你對多線程環境下的變數同步和線程安全的理解。具體來說，它測試了你對以下幾個概念的掌握：

線程安全：理解如何在多線程中保護共享變數，以避免競爭條件（race condition）。在這個例子中，count 是多個線程共享的變數，必須保證它的更新是安全的。

使用 AtomicInteger：這是一種非常有效的處理共享計數器的方法，因為它提供了原子操作，確保即使在多個線程同時更新的情況下，計數器的值也能正確無誤。

使用 synchronized 關鍵字：這也是一種常見的確保線程安全的方式，通過對對象的鎖定來保護臨界區（critical section）。然而，這種方法會引入額外的性能開銷，特別是在高併發情況下。

不當的同步使用：考題中有一個選項（E）使用 synchronized(test.count)，這實際上是錯誤的，因為這會鎖定 count 的值而不是 count 變數本身，這樣的鎖定不會提供預期的線程安全保障。

總結來說，這道題目要求你選擇正確的修改方案，以確保在多線程情況下對 count 的操作是安全的。選擇正確的答案能夠展示你對線程安全機制的理解和應用能力。
 */