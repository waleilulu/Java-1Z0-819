import java.util.function.Predicate;

public class Q175 {
    public static void main(String[] args) {
        int number = 20;
        Predicate<Integer> p = a -> a % 2 !=0;
        // line 1
        //A
        if (p.test(number)) {
        
        //B
        //if(p.apply(number)) {

        //C
        //if(p.get(number)) {

        //D
        //if(p.accept(number)) {
            System.out.println(number + " is odd.");
        } else {
            System.out.println(number + " is even."); //20 is even.
        }
    }
}

/*
Which statement on line 1 enables the Test class to compile?
A. if(p.test(number)) {
B. if(p.apply(number)) {
C. if(p.get(number)) {
D. if(p.accept(number)) {
*/