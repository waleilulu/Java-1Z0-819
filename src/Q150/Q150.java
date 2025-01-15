package Q150;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class Q150 {
    public static void main(String[] args) {
        try {
            Path currentFile = Paths.get("D:/Gjun_java/Java OCP/1Z0-819/examtopic_819/src/Q150/scratch/exam/temp.txt");
            Path outputFile = Paths.get("D:/Gjun_java/Java OCP/1Z0-819/examtopic_819/src/Q150/scratch/exam/new.txt");
            Path directory = Paths.get("D:/Gjun_java/Java OCP/1Z0-819/examtopic_819/src/Q150/scratch");

            // 複製 currentFile 到 outputFile
            Files.copy(currentFile, outputFile);

            // 複製 outputFile 到 directory
            Files.copy(outputFile, directory);
            //outputFile 是一個檔案，而 directory 是一個目錄。這樣的操作會導致 FileAlreadyExistsException，因為目錄已經存在，無法直接將檔案複製到目錄本身。
            

            // 刪除 outputFile
            Files.delete(outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//B，java.nio.file.FileAlreadyExistsException: D:\Gjun_java\Java OCP\1Z0-819\examtopic_819\src\Q150\scratch
/*
The /scratch/exam/temp.txt file exists. The /scratch/exam/new.txt and /scratch/new.txt files do not exist.
What is the result?
A. A copy of /scratch/exam/new.txt exists in the /scratch directory and /scratch/exam/new.txt is deleted.
B. The program throws a FileAlreadyExistsException.
C. /scratch/exam/new.txt and /scratch/new.txt are deleted.
D. The program throws a NoSuchFileException.
*/