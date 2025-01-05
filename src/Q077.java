public class Q077 {
    static StringBuilder sb1 = new StringBuilder("yo ");
    StringBuilder sb2 = new StringBuilder("hi ");

    public static void main (String[] args){
        sb1 = sb1.append(new Q077().foo(new StringBuilder("hey")));
        System.out.println(sb1); //3. 印出 yo + 返回的ey = yo ey
    }
    StringBuilder foo(StringBuilder s){
        System.out.println(s + " oh " + sb2); // 1. 印出 hey oh hi
        return new StringBuilder("ey"); //2. 返回 ey
    }
}

//E
/*
What is the result?
A. hey oh hi
B. yo ey
C. A compile time error occurs.
D. oh hi hey
E. hey oh hi yo ey
F. hey oh hi ey
*/