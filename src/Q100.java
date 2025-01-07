




import java.util.function.Function;
public class Q100 {
    public static void main(String[] args) {
        Function tripler = x -> {return (Integer) x * 3; };
        //C
        //Function tripler = x —> { return (Integer) x * 3; }
        //E
        //Function tripler = x -> { return x * 3; }
        //F
        //Function tripler = x -> [ return x * 3; ]

        Q100.printValue(tripler, 4);
    }
    //public static void printValue(Function f, T num){
    //A
    public static void printValue(Function f, int num) {
        System.out.println("A: " + f.apply(num));
    }

    //B
    //public static void printValue(Function f, T num) {
    //D
    public static void printValue(Function f, Integer num) {
        System.out.println("D: " + f.apply(num));
    }
}

//A、D
/*
Compiling Q100.java gives this compiler warning:
Note: Q100.java uses unchecked or unsafe operations.
Which two replacements remove this compiler warning and prints 12? (Choose two.)
A. Replace line 12 with public static void printValue(Function f, int num) {
B. Replace line 12 with public static void printValue(Function f, T num) {
C. Replace line 9 with Function tripler = x —> { return (Integer) x * 3; }
D. Replace line 12 with public static void printValue(Function f, Integer num) {
E. Replace line 9 with Function tripler = x -> { return x * 3; }
F. Replace line 9 with Function tripler = x -> [ return x * 3; ]
*/