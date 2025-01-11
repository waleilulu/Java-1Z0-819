import java.nio.file.Path;
import java.nio.file.Paths;
import java.net.URI;

public class Q122 {
    public static void main(String[] args) {
        try {
            // 選項 A
            Path pathA = Paths.get("foo");
            System.out.println("Path A: " + pathA);

            // 選項 B (這個會產生錯誤)
            // try {
            //     Path pathB = Paths.getPath("too");
            //     System.out.println("Path B: " + pathB);
            // } catch (NoSuchMethodError e) {
            //     System.out.println("Path B: 方法不存在");
            // }

            // 選項 C (這個會產生錯誤)
            // try {
            //     Path pathC = Path.get(new URI("file:///domains/oracle/test.txt"));
            //     System.out.println("Path C: " + pathC);
            // } catch (NoSuchMethodError e) {
            //     System.out.println("Path C: 方法不存在");
            // }

            // 選項 D (這個會產生錯誤)
            // try {
            //     Path pathD = new Path("foo");
            //     System.out.println("Path D: " + pathD);
            // } catch (InstantiationError e) {
            //     System.out.println("Path D: 不能實例化");
            // }

            // 選項 E (這個會產生錯誤)
            try {
                Path pathE = Paths.get(new URI("file:///domains/oracle/test.txt"));
                System.out.println("Path E: " + pathE);
            } catch (Exception e) {
                System.out.println("Path E: " + e.getMessage());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/*
Which two expressions create a valid Java Path instance? (Choose two.)
A. Paths.get("foo")
B. Paths.getPath("too")
C. Path.get(new URI("file:///domains/oracle/test.txt"))
D. new Path("foo")
E. Paths.get(URL.create("file:///domains/oracle/test.txt"))
*/