package Q166;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Bar extends Foo{
    public void foo(Collection arg){
        System.out.println("Hello World!");
    }
    public void foo(List arg){
        System.out.println("Olá Mundo!");
    }
}
