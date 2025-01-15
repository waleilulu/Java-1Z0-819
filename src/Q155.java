import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Q155 {
    public static void main(String[] args) {
        String filename = "/u01/work" + args[0];
        /*
        You want to validate a path name before the read file. Before validation, all path names should be canonicalized.
        Which code inserted on line n1 will accomplish this?
        這段程式碼的目的是驗證檔案路徑，並在驗證之前將所有路徑名稱標準化（canonicalized）。你在問哪一段程式碼（A、B、C 或 D）適合插入到 // line n1 來完成這個需求。
        */
        // line n1
        //A
        // File file = new File(filename).getAbsoluteFile();
        // FileInputStream fis = new FileInputStream(file);

        //B
        // Path file = Paths.get(filename);
        // String canonicalPath = file.normalize().toString();
        // FileInputStream fis = new FileInputStream(canonicalPath);

        //C
        // Path file = Paths.get(filename);
        // Path canonicalPath = file.toAbsolutePath().toString();
        // FileInputStream fis = new FileInputStream(canonicalPath);

        //D
        try {
            File file = new File(filename);
            String canonicalPath = file.getCanonicalPath(); // getCanonicalPath() 方法返回標準的路徑名稱字串。
            FileInputStream fis = new FileInputStream(canonicalPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//D