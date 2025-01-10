package Q115;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Path filePath = Paths.get("src/Q115/course.txt");
        try {
            
            //Which code fragment at line 1 prints the lines that contain Java from the course.txt file?
            //E


            /* line 1 */
            //A
            // List<String> lines2 = File.readAllLines(filePath).filter(s ->s.contains("Java"));
            // for(String line: lines2){
            //     System.out.println(line);
            // }
            
            //B
            //System.out.println(Files.readString(filePath).contains("Java")); //true

            //C
            //File.lines(filePath).map(s->s.contains("Java")).forEach(System.out::println);

            //D
            // List<String> lines1 = Files.readAllLines(filePath).contains("Java");
            // for(String line : lines2){
            //     System.out.println(line);
            // }

            //E
            Files.lines(filePath).filter(s->s.contains("Java")).forEach(System.out::println); //Java:1     Java Server Pages: 3

        } catch (IOException ex) {
            System.out.format("File IO Exception is thrown.", ex);
        }
    }
}
