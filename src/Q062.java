public class Q062 {
    public void process(byte v){
        System.out.println("Byte value " + v);
    }
    public void process(short v){
        System.out.println("short value " + v);
    }
    public void process(Object v){
        System.out.println("Object value " + v);
    }
    public static void main (String[] args){
        byte x = 12;
        short y =13;
        new Q062().process(x+y);
    }
}

//Object value 25，由於 int 不能直接匹配 byte 或 short 類型的 process 方法，而 Object 是所有類型的父類型，所以 process(Object v) 方法會被選中來處理這個 int 類型的值
/*
What is the output?
A. Short value 25
B. The compilation fails due to an error in line 1.
C. Byte value 25
D. Object value 25
*/