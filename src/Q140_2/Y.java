package Q140_2;
import java.util.ArrayList;

import Q140_1.X;

public class Y extends X{
    public Y(){
        super(new ArrayList<>());
    }
    public void doprocess(){
        items.forEach(System.out::println);
    }
    public void removeItem(String item){
        super.removeItem(item);
    }
}

//A
/*
A. The class X is not accessible in p2.
B. The constructor X(List) has lesser visibility rights than the constructor Y(List).
C. The method X.removeItem(String item) cannot be overridden by Y.removeItem(String item).
D. The method Y.doProcess() has higher visibility rights than the abstract method X.doProcess().
E. The constructor X(List) does not match the Y() constructor.
*/