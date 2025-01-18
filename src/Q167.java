public class Q167 {
    public static void main(String[] args) {
        String s = "10";
        //int x = 0;
        try {
            int x = 0;
            x = Integer.parseInt(s, 2); //line 1
            System.out.println("X is " + x);
        } catch (NumberFormatException e) {
            System.out.println("Error parsing value of " + x); //line 2
            // catch 區塊中無法訪問變數 x，原因在於變數 x 的作用範圍問題。這是因為變數 x 在 try 區塊內部被定義，且 x 的作用範圍僅限於 try 區塊內。將 x 的聲明移到 try-catch 結構之外，這樣它就可以在 try 和 catch 區塊中都被訪問到。
        }
    }
}

//C
/*
What is the result?
A. X is 2
B. The compilation fails due to an error in line 1
C. The compilation fails due to an error in line 2
D. Error parsing value 0
E. X is 10
*/