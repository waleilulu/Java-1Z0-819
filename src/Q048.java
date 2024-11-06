import java.util.ArrayList;
import java.util.List;

public class Q048 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(List.of("Earth", "Wind", "Fire"));
        //List<String> list2 = List.copyOf(list1); /* A. list2 是使用 List.copyOf(list1) 創建的 list1 的副本。List.copyOf() 會創建一個包含相同元素的不可變列表。 */
        List<String> list2 = new ArrayList<>(list1); /* B. 如果改成new ArrayList<>(list1)來接就可以，印出來就是true */
         
        System.out.println(list1); //[Earth, Wind, Fire]
        System.out.println(list2); //[Earth, Wind, Fire]

        list1.sort((String item1, String item2)->item1.compareTo(item2));
        System.out.println(list1); //[Earth, Fire, Wind]

        list2.sort((String item1, String item2)->item1.compareTo(item2)); //A. list2是不可變列表，所以不能被排序，導致排序操作拋出 UnsupportedOperationException
        System.out.println(list2); //B. [Earth, Fire, Wind]
        System.out.println(list2.equals(list1)); //B. true
    }
}
//Exception in thread "main" java.lang.UnsupportedOperationException
/*
What is the result?
A. A java.lang.NullPointerException is thrown.
B. false
C. A java.lang.UnsupportedOperationException is thrown.
D. true
*/