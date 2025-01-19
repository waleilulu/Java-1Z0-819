package Q179;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.stream.Stream;

public class Q179 {
    // File structure diagram
    /*
    - continent
        | a.txt
        |- country
            | b.txt
            | - state
                | c.txt
                |+ county
    */
    //改成以下路徑
    /*
    D:\Gjun_java\Java OCP\1Z0-819\examtopic_819\src\Q179
    ├── Q179.java
    ├── continent
        ├── a.txt
        ├── country
            ├── b.txt
            ├── state
                ├── c.txt
                ├── county
    */

    public static void main(String[] args) {
        Path startPath = Paths.get("D:/Gjun_java/Java OCP/1Z0-819/examtopic_819/src/Q179/continent");

        // 判斷是否為目錄
        BiPredicate<Path, BasicFileAttributes> pred = (path, fileAttrs) -> {
            return fileAttrs.isDirectory();  // 只搜尋目錄
        };

        int depth = 1;  // 設定搜尋深度為1

        try (Stream<Path> stream = Files.find(startPath, depth, pred)) {
            stream.forEach(System.out::println);  // 印出所有目錄
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//C
/*
D:\Gjun_java\Java OCP\1Z0-819\examtopic_819\src\Q179\continent
D:\Gjun_java\Java OCP\1Z0-819\examtopic_819\src\Q179\continent\country
*/

/*
What is the result?
A. /continent/country/state
B. /continent/country/state/county
C. /continent
/continent/country
D. /continent/
/continent/country
/continent/country/state
/continent/country/state/county
*/