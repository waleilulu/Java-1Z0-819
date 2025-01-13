public class Q139 {
    public static void main(String[] args) {
    StringBuilder txt1 = new StringBuilder("PPQRRRSTT");
    int i = 0;
    a:
    while (i < txt1.length()) {
        char x = txt1.charAt(i);
        int j = 0;
        i++;
        b:
        while (j < txt1.length()) {
            char y = txt1.charAt(j);
            if(i !=j && y==x){
                txt1.deleteCharAt(j);
                // line 1
                //A
                //j--;

                //B
                //break a; //PPQRRSTT

                //C
                //continue a; //PRRT

                //D
                //continue b; //QS

                //E
                break b; //PRRT

                //F
                //i--;
            }
            j++;
        }
        }
        System.out.println(txt1);
    }
}

//C、E
/*
Which two statements inserted independently at line 1 enable this code to print PRRT? (Choose two.)
A. j--;
B. break a;
C. continue a;
D. continue b;
E. break b;
F. i--;
*/