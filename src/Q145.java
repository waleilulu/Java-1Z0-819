import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Q145 {
    //public static void main(String[] args) {
    //F
    public static void main(String[] args) throws IOException{
        try(FileInputStream in = new FileInputStream("foo.txt")){
            
        }
        //catch (FileNotFoundException e) {
        //D
        catch (Exception e){
            
        }
    }
}

//D、F
/*
Which two actions, independently, enable the code to compile? (Choose two.)
A. Inserting:
finally ( in.close(); )

B. Replacing the catch block with:
catch (FileNotFoundException | Exception e) ( )
finally ( in.close(); )

C. Adding throws FileNotFoundException declaration at the main() method

D. Replacing the catch block with:
catch (Exception e) ( )

E. Replacing the catch block with:
catch (Exception | IOException e) ( )

F. Adding throws IOException declaration at the main() method
*/