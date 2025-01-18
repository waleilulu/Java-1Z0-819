package Q166;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Foo f1 = new Foo();
        Foo f2 = new Bar();
        Bar b1 = new Bar();

        Collection<String> c = new ArrayList<>();
        f1.foo(c);  //Bonjour le monde!
        f2.foo(c);  //Hello World!
        b1.foo(c);  //Hello World!
    }
}

//C、F、I
/*
Which three are true? (Choose three.)
A. f1.foo(c) prints Hello world!
B. f2.foo(c) prints Olá Mundo!
C. f1.foo(c) prints Bonjour le monde!
D. f2.foo(c) prints Bonjour le monde!
E. b1.foo (c) prints Olá Mundo!
F. f2.foo(c) prints Hello world!
G. f1.foo(c) prints Olá Mundo!
H. b1.foo(c) prints Bonjour le monde!
I. b1.foo(c) prints Hello world!
*/