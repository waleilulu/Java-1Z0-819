import java.io.*;

public class Q014 {
    public static void main(String[] args) {
        try {
            doA(); // 1.
            doB(); // 4.

        } catch (IOException e) { // 7. 例外拋出，這裡就會接到
            System.out.print("c"); // 8. 印出c
            return; // 9. 退出main
        } finally {
            System.out.print("d"); //10. 無論是否發生異常，finally 區塊都會被執行，因此輸出 d。
        }
        System.out.print("f");
    }

    @SuppressWarnings("unused")
    private static void doA() {
        System.out.print("a"); // 2. 印出a
        if (false) { // 3. 因為 if (false) 的條件為 false，所以不會拋出異常。
            throw new IndexOutOfBoundsException();
        }
    }

    private static void doB() throws FileNotFoundException {
        System.out.print("b"); // 5. 印出b
        if (true) { // 6. 因為 if (true) 的條件為 true，所以會拋出 FileNotFoundException。
            throw new FileNotFoundException();
        }

    }
}
