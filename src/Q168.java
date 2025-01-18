interface ExampleInterface {
    int one = 1;
    static int two = 2;
    static final int three = 3;
}

public class Q168  implements ExampleInterface{
    public static void main(String[] args) {
        ExampleInterface theInterface = new Q168();
        Q168 theInstance = new Q168();
        //line 1
        
        //A
        //int i = theInstance.three++;

        //B
        int b = two;

        //C
        int c = three;

        //D
        //int a = one++;

        //E
        int f = ExampleInterface.three;

        //F
        int h = theInterface.two;

        //G
        //int e = ExampleInterface.two++;

        //H
        int a = ExampleInterface.one;

        //I
        int g = theInstance.one;
    }
}


/*
Which three statements cause a compiler error when inserted at line l? (Choose three.)
A. int i = theInstance.three++;
B. int b = two;
C. int c = three;
D. int a = one++;
E. int f = ExampleInterface.three;
F. int h = theInstance.two;
G. int e = ExampleInterface.two++;
H. int a = ExampleInterface.one;
I. int g = theInstance.one;
*/