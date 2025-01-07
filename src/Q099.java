public class Q099 {
    public static void main(String[] args) {
        int x = 0;
        do{
            x++;
            if(x==1){
                continue;
            }
            System.out.println(x);
        }while(x<1);
    }
}

//D
/*
What is the result?
A. 0
B. It prints 1 in infinite loop.
C. 1
D. The program prints nothing.
E. 1
*/