import java.util.Arrays;

public class Q183 {
    private String name;
    private int age;
    public Q183(String name, int age){
        this.name = name;
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public static void main(String[] args) {
        var persons = Arrays.asList( new Q183("Max", 18),
                                     new Q183("Peter", 23),
                                     new Q183("Pamela", 23),
                                     new Q183("David", 12)
                                   );
        int num = persons.stream()
                         .mapToInt(Q183::getAge) // 將流中的每個 Q183 物件映射為其年齡。Q183::getAge 是一個方法引用，表示對每個 Q183 物件調用 getAge 方法
                         .filter(p -> p < 20)  // 使用 filter(p -> p < 20) 過濾出年齡小於20的元素，挑選出18、12
                         .reduce(0, (a, b) -> a + b); //過濾後的年齡 [18, 12]，累加過程如下：
                        /*
                         初始值 a = 0
                         第一個元素 b = 18，計算 a + b = 0 + 18 = 18
                         更新累加器 a = 18
                         第二個元素 b = 12，計算 a + b = 18 + 12 = 30
                         更新累加器 a = 30
                        */
        System.out.println(num); // 30               
    }
}

//A
/*
What is the output?
A. 30
B. 35
C. 41
D. 46
*/