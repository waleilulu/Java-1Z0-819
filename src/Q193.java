public class Q193 {
    void display(int i){
        System.out.println("one");
    }
    void display(long l){
        System.out.println("two");
    }
    public static void main(String[] args) {
        new Q193().display(0B1010_0101_1001_0110); // 1010_0101_1001_0110 是二進位的數值，等於十進位的 42454
    }
}

//C
/*
What is the result?
A. The compilation fails.
B. two
C. one
D. A NurberFormatException is thrown at runtime.
*/