package Q025;
import java.io.FileReader;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        char[] characters = new char[100];
        //try (FileReader reader = new FileReader("file_to_path.txt");) 

        //使用相對路徑
        try (FileReader reader = new FileReader("D:\\Gjun_java\\Java OCP\\1Z0-819\\examtopic_819\\bin\\Q025\\file_to_path.txt")) 
        {   
            // You want to read data through the reader object.
            // Which statement inserted on line 1 will accomplish this?

            //A. 
            //characters = reader.read();

            //B. 
            //reader.readLine();

            //C. 
            //characters.read();

            //D. reader.read(characters); 是正確的，因為這個方法符合 FileReader 的設計，用於從文件中讀取字符並填充到指定的字符陣列中。這樣的寫法可以有效地從文件中讀取多個字符，並在一次呼叫中將它們存入陣列中。
            reader.read(characters);

            System.out.println(String.valueOf(characters));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

