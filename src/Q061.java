import java.util.ArrayList;
import java.util.List;

public interface Q061 {
    public void doProcess();
}

class HardWorker implements Q061 {
    public void doProcess(){
        System.out.println("do things");
    }
}

class Cheater implements Q061 {
    public void doProcess(){
    }
}

class Main<T extends Q061> extends Thread{          //Line1，Main 類是泛型類，並且擴展了 Thread 類。它使用 List<T> 來存儲實現 Q061 的對象
    private List<T> processes = new ArrayList<>();  //Line2，Main 類有一個方法 addProcess，將類型為 T 的對象添加到 processes 列表中
    //public void addProcess(HardWorker w){         //Line3
    public void addProcess(T w){                    //D，T 是泛型，表示所有實現了 Q061 的類型。所以，addProcess 方法的參數應該是 T 類型，而不是固定的 HardWorker。這樣的修改可以處理所有類型的 Q061 實現。這樣做的目的是使得方法 addProcess 能夠接收任何類型的 Q061 實現，而不僅僅是 HardWorker。
        processes.add(w);
    }
    public void run(){
        processes.forEach((p)->p.doProcess());
    }
}

//D
/*
What needs to change to make these classes compile and still handle all types of Interface Worker?
A. Replace Line 3 with public void addProcess (Worker w) {.
B. Replace Line 1 with public class Main extends Thread {.
C. Replace Line 2 with private List processes = new ArrayList<>();.
D. Replace Line 3 with public void addProcess(T w) {.
*/