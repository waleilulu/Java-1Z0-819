import java.util.Comparator;
import java.util.List;

public class Q195 {
    String hue;
    int value;
    public Q195(String hue, int value){
        this.hue = hue;
        this.value = value;
    }
    public String toString(){
        return this.hue + ":" + this.value;
    }
    public static void main(String[] args) {
        //List clrs = List.of(new Q195("Red", 100),
        List<Q195> clrs = List.of(new Q195("Red", 100),
                            new Q195("Yellow", 50),
                            new Q195("Red", 75),
                            new Q195("Yellow", 75));
        //Comparator hueSrtr = (h1, h2) -> h1.hue.compareTo(h2.hue);
        Comparator<Q195> hueSrtr = (h1, h2) -> h1.hue.compareTo(h2.hue);
        //Comparator valueSrtr = (h1, h2) -> {
        Comparator<Q195> valueSrtr = (h1, h2) -> {
                                            if (h1.value >= h2.value){
                                                return 1;
                                            } else{
                                                return -1;
                                            }
        };
        clrs.sort(hueSrtr.thenComparing(valueSrtr));
        System.out.println(clrs);
        /*
        使用 List.of() 創建的 List 是不可變的（immutable），這意味著：
        不能添加元素：無法使用 add() 方法向列表中新增元素。
        不能移除元素：無法使用 remove() 方法刪除列表中的元素。
        不能更新元素：無法修改列表中已存在的元素（無法執行 set() 方法）。
        不能排序：無法直接對列表進行排序（無法調用 sort() 方法）。
        */
    }
}

//C
/*
What is the result?
A. [Red:75, Red: 100, Yellow:50, Yellow:75]
B. [Yellow:75, Yellow:50, Red:100, Red:75]
C. An Exception is thrown at runtime.
D. [Yellow:50, Yellow:75, Red:75, Red:100]
E. [Red:100, Red:75, Yellow:75, Yellow:50]
*/