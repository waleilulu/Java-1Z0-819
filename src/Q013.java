import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q013 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // 使用 peek
        System.out.println("Using peek:");
        List<String> upperCaseNames = names.stream()
                .map(String::toUpperCase)
                .peek(name -> System.out.println("Processing with peek: " + name))

                .collect(Collectors.toList()); // 使用 Collectors.toList() 收集結果
        // 打印轉換後的大寫名字列表
        System.out.println("Uppercase names: " + upperCaseNames);

        // 使用 forEach
        System.out.println("\nUsing forEach:");
        names.stream()
                .forEach(name -> System.out.println("Processing with forEach: " + name)); // 終端操作
    }
}
/*
 * Why would you choose to use a peek operation instead of a forEach operation
 * on a Stream?
 * A. to process the current item and return void
 * B. to remove an item from the end of the stream
 * 
 * C. to process the current item and return a stream
 * peek 操作可以讓你對流中的每個元素進行處理，但不會改變流本身，並且可以繼續返回一個流。相比之下，forEach
 * 是一個終端操作，進行處理後不會返回任何流。
 * 
 * D. to remove an item from the beginning of the stream
 */