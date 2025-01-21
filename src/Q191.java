@Deprecated
class OldClass {
    public void display() {
        System.out.println("This class is deprecated.");
    }
}

public class Q191 {
    public static void main(String[] args) {
        OldClass obj = new OldClass(); // 編譯時會有警告
        obj.display();
    }
}

//A、C
/*
Which two statements are true about a class that is marked @Deprecated? (Choose two.)

A. Using the class will cause the Java compiler to give a warning.
B. The class cannot be extended.
C. The author of the class wants to discourage people from using the class in any way.
D. There is always another class that can be used instead of the deprecated class.
E. Using the class is guaranteed to cause errors at runtime.
*/