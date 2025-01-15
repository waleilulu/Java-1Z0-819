class Thing{
    int x, y, z;
    public Thing(){
        this(2, 1);
        System.out.println(x + "," + y + "," + z); // 6. 返回到無參數建構子 Thing()， 輸出 0, 0, 0
    }
    public Thing(int x){ // 3. 呼叫單參數建構子 Thing(int x)
        System.out.println(x + "," + y + "," + z); // 4. 這裡的 x 是 2，輸出 2,0,0

    }
    public Thing(int x, int y){ // 2. 呼叫雙參數建構子 Thing(int x, int y)
        this(2);
        System.out.println(x + "," + y + "," + z); // 5. 返回到雙參數建構子 Thing(int x, int y)， 輸出 2, 1, 0
    }
}

public class Q149 {
    public static void main(String[] args) {
        Thing t1 = new Thing(); // 1. 呼叫無參數建構子 Thing()
    }
}

//A
/*
What is the result?
A. 2, 0, 0
2, 1, 0
0, 0, 0

B. 0, 0, 0
1, 0, 0
2, 1, 0

C. 0, 0, 0
2, 1, 0
2, 0, 0

D. 0, 0, 0
2, 1, 0
2, 1, 0

E. 1, 0, 0
1, 1, 0
0, 0, 0
*/