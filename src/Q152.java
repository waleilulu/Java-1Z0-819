import java.util.List;

public class Q152 {
    public static void main(String[] args) {
        List even = List.of(); //List.of() 方法創建了一個不可變的空列表 even。這意味著這個列表不能被修改（例如，不能添加或刪除元素）。
        even.add(0, -1);
        even.add(0, -2);
        even.add(0, -3);

        System.out.println(even); //Exception in thread "main" java.lang.UnsupportedOperationException
    }
}

//A
/*
What is the output?
A. A runtime exception is thrown.
B. The compilation fails.
C. [-3, -2, -l]
D. [-1, -2, -3]
*/