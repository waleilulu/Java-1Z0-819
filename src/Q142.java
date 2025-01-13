public class Q142 {
    public static void greet(String []args){
        System.out.print("Hello ");
        for(String arg: args){
            System.out.println(arg);

        }
    }>/span>
    public static void main(String[] args){
        Q142 c = null;
        c.greet();
    }
}

//D，多了個>/span>。如果拿掉的話會印出Hello，答案就是A
/*
What is the result?
A. Hello
B. NullPointerException is thrown at line 4
C. NullPointerException is thrown at line 10
D. A compilation error occurs
*/