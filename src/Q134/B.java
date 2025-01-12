package Q134;

public class B extends A{
    protected void print(){
        System.out.print("Derived class");
    }
    public static void main(String[] args) {
        B b = new B();
        ((A)b).print();
    }
}

//C
/*
What is the output?
A. Base class
B. The compilation fails.
C. Derived class
D. An exception Is thrown at runtime.
*/