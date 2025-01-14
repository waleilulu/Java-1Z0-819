class Location {
    static String city;
    public Location(String locationCity){
        city = locationCity;
    }
}

public class Q144 {
    public static void main(String[] args) {
        var location = new Location("San Francisco");
        location = null;
        System.gc(); // 呼叫 System.gc()，這是一個建議 JVM 進行垃圾回收的請求，但不保證會立即執行。
        System.out.println(Location.city); // San Francisco
    }
}

//C
/*
What is the result?
A. java.lang.NullPointerException is thrown
B. null
C. San Francisco
D. java.lang.IllegalException is thrown
*/