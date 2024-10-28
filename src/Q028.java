import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.BrokenBarrierException;
import java.util.stream.IntStream;

public class Q028 {
    public static void main(String[] args) {
        List<Integer> list = new CopyOnWriteArrayList<>();
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        CyclicBarrier barrier = new CyclicBarrier(2, () -> System.out.println(list));

        IntStream.range(0, 5).forEach(n -> executorService.execute(() -> {
            try {
                list.add(n);
                barrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                System.out.println("Exception");
            }
        }));

        executorService.shutdown();
    }
}
/*因為 CyclicBarrier 被設置為等待兩個線程，每次只有兩個線程可以通過屏障並執行其後的動作。而在這裡啟動了五個線程，因此當前兩個線程到達屏障後，剩下的三個線程將會被阻塞，因為沒有其他線程可以到達屏障來解除阻塞。

這導致了死鎖，因為最後的一個線程將永遠無法到達屏障，最終使得程式無法結束。 */

/*
Which statement is true?
A. It never finishes.
B. The action of CyclicBarrier is called five times.
C. It finishes without any exception.
D. Threads in executorService execute for each of the two threads.
*/