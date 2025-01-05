public class Q081 {
   int a = 0;
   int b = 0;
   int c = 0;

     // 使用 synchronized 確保這個方法是線程安全的
     public synchronized void foo(int i) {
        a += b * i;
        c -= b * i;
    }

    // 使用 synchronized 確保這個方法是線程安全的
    public synchronized void setB(int i) {
        b = i;
    }
}

//B，synchronized 關鍵字：當你在方法聲明前加上 synchronized，Java 會為這個方法加鎖。當某個線程執行該方法時，其他線程必須等待，直到這個線程執行完畢並釋放鎖。這樣就能防止多個線程同時修改共享變數 a、b 和 c，避免競爭條件的發生。

/*
Which makes class A thread safe? 如何確保class A 執行序的安全?
A. Class A is thread safe.
B. Make foo and setB synchronized.
C. Make foo synchronized.
D. Make A synchronized.
E. Make setB synchronized.
*/