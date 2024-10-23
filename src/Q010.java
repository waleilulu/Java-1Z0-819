import java.util.ArrayList;
import java.util.Collections; // 引入 Collections 類
import java.util.List;

public class Q010 {
    public static void main(String[] args) {
        // 創建一個可變的 ArrayList
        List<String> list1 = new ArrayList<>();
        list1.add("A"); // 使用 list1，而不是 list
        list1.add("B");

        // Collections.unmodifiableList為不可變的列表，他也是list1原始列表的視圖，如果list1有修改，list2的內容也會更動
        List<String> list2 = Collections.unmodifiableList(list1);

        // 添加元素到 list1，這會影響到 list2，因為它是對 list1 的視圖
        list1.add("C");
        //list2.remove("C"); //list2為不可變的列表，不能修改裡面元素

        // 印出 list1 和 list2
        System.out.println(list1); // 印出: [A, B, C]
        System.out.println(list2); // 印出: [A, B, C]
    }
}
