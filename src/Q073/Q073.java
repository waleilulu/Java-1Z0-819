package Q073;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q073 {
    public static void main(String[] args) {
        String fileName = "src/Q073/lines.txt";
        List<String> list = new ArrayList<>();
        try (Stream<String> stream = Files.lines(Paths.get(fileName))){
            list = stream
                    .filter(line -> !line.equalsIgnoreCase("JAVA")) //在 lines.txt 中，JAVA - 是一個包含 JAVA 以外字符的行，所以這條過濾條件無法將 JAVA - 過濾掉
                    .map(String::toUpperCase)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            
        }
        list.forEach(System.out::println);
    }
}
//D
/*
What is the result?
A. C -
C++
Go -
Kotlin

B. JAVA

C. C -
C++
GO -
KOTLIN

D. C -
C++
JAVA -
GO -
KOTLIN
*/