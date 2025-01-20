package Q182;

public class Tester {
    public static void main(String[] args) {
        try (Resource r = new Resource()) { // 當 Resource 物件被建立時，會呼叫其建構子，印出 "A"
            r.printResource(); // 在 try 區塊中，呼叫 printResource 方法，印出 "C"。
                               // 當 try-with-resources 語句結束時，會自動呼叫 close 方法，印出 "B"。
        } finally {
            System.out.print("D"); // 最後，執行 finally 區塊，印出 "D"。
        }
    }
}

//C
/*
What is the result?
A. ADBC
B. ACB
C. ACBD
D. ACD
E. ACDB
*/