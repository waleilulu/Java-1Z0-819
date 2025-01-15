interface InterfaceOne {
public void methodA();
public void methodB();
    
}

//public interface interfaceTwo extends AbstractClass{
// E: InterfaceTwo should no longer extend AbstractClass
    interface interfaceTwo {
        
}

abstract class AbstractClass implements InterfaceOne{
    public String origin = "Abstract Class";
    public void methodA(){
        System.out.println("A");
    }
    public abstract void methodC();
}

class ConcreteClass extends AbstractClass{
    // public void methodC(String c){
    //     System.out.println(c);
    // }
    // A: Implement methodC() in ConcreteClass
    public void methodC() {
        System.out.println("C");
    }
    
    // B: Implement methodB() in ConcreteClass
    public void methodB() {
        System.out.println("B");
    }
}
public class Q146 {
    public static void main(String[] args) {
        ConcreteClass concrete = new ConcreteClass();
        concrete.methodA();
        concrete.methodB();
        concrete.methodC();
    }
}

//A、B、E

/*
Which three changes make this code compile? (Choose three.)
A. Implement methodC() in ConcreteClass
B. Implement methodB() in ConcreteClass
C. Add the keyword abstract to the methodA() and methodB() declarations in InterfaceOne
D. Remove methodA() from InterfaceOne
E. InterfaceTwo should no longer extend AbstractClass
F. Implement methodA() in ConcreteClass
G. Remove methodA() from AbstractClass
*/