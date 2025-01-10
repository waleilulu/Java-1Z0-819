import java.util.Optional;

public class Q116 {
    public static void main(String[] args) {
        Optional<String> value = createValue();
        String str = value.orElse("Duke");
        System.out.println(str); 
    }
    static Optional<String> createValue(){
        String s = null;
        return Optional.ofNullable(s);
    }
}

//C
/*
What is the output?
A. A NullPointerException is thrown at run time.
B. null
C. Duke
D. A NoSuchElementException is thrown at run time.
*/