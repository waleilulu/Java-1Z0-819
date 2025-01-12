public class Q136 {
    public static void main(String[] args) {
        float x = 2, y = 4, z = 4;
        float a = y / x, b = y / z; //a=2, b=1
        if(a>b){
            System.out.println(a + b); //3.0，型態是float
            //System.out.println((int)(a + b));  //這可以強制轉型成int
        }
    }
}

//A

/*
What is the result?
A. 3.0
B. The program prints nothing
C. 2.0
D. 1.0
E. An exception is thrown at runtime
*/
