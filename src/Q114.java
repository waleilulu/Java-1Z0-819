//import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Q114 {
    public static void main(String[] args) throws Exception {
        ExecutorService es = Executors.newCachedThreadPool();
        es.execute(()->System.out.print("Ping "));

        //Which statement at line 1 will print Ping Pong?
        // line1
        //A
        // Future<String> future = new Callable() {
        //     public String call() throws Exception{
        //         return "Pong";
        //     }
        // }.call();    

        //B
        //Future<String> future = es.execute(()-> "Pong");

        //C
        Future<String> future = es.submit(()-> "Pong");

        //D
        // Future<String> future = es.invokeAny(new Callable<String>() {
        //     public String call() throws Exception{
        //         return "Pong";
        //     }
        // });


    System.out.println(future.get()); // line 2
    es.shutdown();
    }       
}

//C，印出Ping Pong