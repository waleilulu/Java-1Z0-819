package Q104;

public class Car extends Automobile{
                        // line 2       
    //void wheels(int i){ // line 3
    //A
    void wheels(){
        System.out.print(4);
    }
    public static void main(String[] args) {
        Automobile ob = new Car(); // line 4
        ob.wheels();
    }

}

//A
/*
What must you do so that the code prints 4?
A. Remove the parameter from wheels method in line 3.
B. Remove abstract keyword in line 1.
C. Replace the code in line 2 with Car ob = new Car();.
D. Add @Override annotation at line 2.
*/