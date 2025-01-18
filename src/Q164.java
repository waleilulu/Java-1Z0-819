import java.util.stream.IntStream;

public class Q164 {
    public static void main(String[] args) {
        IntStream.range(1, 4)
            .peek(System.out::print)
            .peek(i ->{
                if(i == 3)
                    throw new RuntimeException("Exception thrown");
            });

            //加上這個，才會觸發流的處理
            //.forEach(i -> {});  //123Exception in thread "main" java.lang.RuntimeException: Exception thrown
    }
}

//A
/*
What is the result?
A. The program prints nothing.
B. The program prints: 12 and the RuntimeException is thrown.
C. The program prints: 123 and the RuntimeException is thrown.
D. The program prints 1234 and a java.lang.IllegalStateException is thrown.
*/