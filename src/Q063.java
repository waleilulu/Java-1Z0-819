import java.util.List;
import java.util.Optional;

public class Q063 {
    public static void main(String[] args) {
    var fruits = List.of("apple", "orange", "banana", "lemon");
    //Optional<String> result = fruits.stream().filter(f -> f.contains("n")).findAny(); //Line1
    Optional<String> result = fruits.parallelStream().filter(f -> f.contains("n")).findAny();

    System.out.println(result.get());
    }
}

//D
/*
使用 stream()（順序流）：
當你使用順序流 (stream()) 時，元素會按照它們在列表中的順序依次處理。
filter(f -> f.contains("n")) 操作會順序應用於每個元素，然後 findAny() 會返回找到的第一個匹配的元素。

使用 parallelStream()（並行流）：
當你使用並行流 (parallelStream()) 時，元素會被多個執行緒並行處理。這意味著處理的順序是不確定的。元素可能會按照不同的順序處理，這取決於並行執行緒的排程。
findAny() 在並行流中會返回第一個符合條件的元素，但由於流是並行處理的，返回的元素可能會和使用順序流時不同，具體取決於執行緒如何處理數據。
*/
/*
You replace the code on line 1 to use ParallelStream.
Which one is correct?
A. The code will produce the same result.
B. The compilation fails.
C. A NoSuchElementException is thrown at run time.
D. The code may produce a different result.
*/