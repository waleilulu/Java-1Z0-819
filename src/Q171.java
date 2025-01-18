class Resource{
    public Q171 owner;
}
public class Q171 {
    private boolean ready = true;

    public synchronized boolean isReady(){
        return ready;
    }

    public synchronized void work(Q171 other, Resource resource){
        while(ready){
            while(resource.owner != this){ //w1 還是 w2 進入 work 方法，它們都在檢查 resource.owner != this，然後進入等待狀態，直到對方變更資源擁有權。但是由於雙方都無法更改擁有權，這會導致死鎖。
                try{
                    wait(10);
                }catch(InterruptedException e){
                    
                }
            }
            if (other.isReady()) {
                resource.owner = other;
            } else{
                // do work with resource
                ready = false;
                resource.owner = other;
            }
        }
    }

    public static void main(String[] args) {
        Q171 w1 = new Q171();
        Q171 w2 = new Q171();
        Resource r = new Resource();
        r.owner = w1; 

        // 創建並啟動 w1 線程
        new Thread(()->{
            w1.work(w2, r);
        }).start();

        // 創建並啟動 w2 線程
        new Thread(() -> {
            w2.work(w1, r);
        }).start();
    }
}

//B
/*
Which describes the fragment?
A. It throws an IllegalMonitorStateException.
B. It is subject to deadlock.
C. It is subject to livelock.
D. The code does not compile.
*/