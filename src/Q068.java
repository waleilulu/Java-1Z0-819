public class Q068 {
    public static void main(String[] args) {
        var i = 10;
        var j = 5;
        i+=(j*5+i)/j-2;
        System.out.println(i);
    }
}
/*
10+=[(5*5+10)/5]-2;
10+=7-2
10+=5
10+5=15
*/

//C. 15
/*
What is the result?
A. 5
B. 11
C. 15
D. 21
E. 23
*/