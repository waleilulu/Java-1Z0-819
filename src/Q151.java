public class Q151 {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = s1.intern();
        StringBuilder sb1 = new StringBuilder("Java");
        String s3 = sb1.toString();
        System.out.println("1: " + (s1 == s2)); // false，比較的是記憶體位置
        System.out.println("2: " + s1.equals(sb1.toString())); // true，比較的是值，而不是記憶體位置
        System.out.println("3: " + (s2 == s3)); // false，比較的是記憶體位置
    }
}

//A
/*
What is the result?
A. false
true
false

B. false
true
true

C. false
false
false

D. true
false
true
*/