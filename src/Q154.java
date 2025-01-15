public class Q154 {
    public void analyze(Object[] o){ //接受 Object[] 類型的參數。
        System.out.println("I am on object array");
    }
    public void analyze(long[] l){ //接受 long[] 類型的參數。
        System.out.println("I am an array");
    }
    public void analyze(Object o){ //接受 Object 類型的參數。
        System.out.println("I am an object");
    }
    public static void main(String[] args) {
        int[] nums = new int[10]; //int[] nums 是一個 int 類型的陣列，int[] 不能自動轉換為 Object[] 或 long[]。因此，int[] 會被視為一個 Object 類型的參數，並呼叫 analyze(Object o) 方法。
        new Q154().analyze(nums); // line 1
    }
}

//D
/*
What is the output?
A. The compilation fails due to an error in line 1.
B. I am an array
C. I am an object array
D. I am an object
*/