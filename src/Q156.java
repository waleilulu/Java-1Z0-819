import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Q156 {
    File file1 = new File("file1.txt");
    File file2 = new File("file2.txt");

    public void readFiles() {
    //語法錯誤：try-with-resources 語句應該在方法內部，而不是在類別層級
        try(BufferedReader reader = new BufferedReader(new FileReader(file1))){
            System.out.println(reader.readLine());

            // 語法錯誤：try-with-resources 語句中的資源不能重新賦值
            reader = new BufferedReader(new FileReader(file2));
            System.out.println(reader.readLine());
            }
        catch (IOException e){
            System.out.println("Error reading files");
        }
    }


    // 正確寫法
    // public void readFiles() {
    //     try (BufferedReader reader1 = new BufferedReader(new FileReader(file1))) {
    //             System.out.println(reader1.readLine());
    //         } catch (IOException e) {
    //             System.out.println("Error reading file1");
    //         }

    //         try (BufferedReader reader2 = new BufferedReader(new FileReader(file2))) {
    //             System.out.println(reader2.readLine());
    //         } catch (IOException e) {
    //             System.out.println("Error reading file2");
    //         }
    // }
}

/*
What is the result?
A. The compilation fails.
B. An unchecked exception is thrown at run time.
C. Error reading files is printed on the console.
D. The content from filel.txt and file2.txt is printed on the console.
*/