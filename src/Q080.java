interface AbilityA {
    default void action() {
        System.out.println("a action");
    }
}

interface AbilityB {
    void action();
}

public class Q080 implements AbilityA, AbilityB {
    @Override
    public void action() {
        System.out.println("ab action");
    }

    public static void main(String[] args) {
        AbilityB x = new Q080();  
        x.action();  
    }
}

//B

/*
What is the result?
A. The compilation fails on line 2.
B. ab action
C. An exception is thrown at run time.
D. a action
E. The compilation fails on line 1.
*/