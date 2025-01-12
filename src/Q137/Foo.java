package Q137;

public class Foo {
    private String a() {
        return "Hello World!";
    }

    public String b() {
        return a();
    }
    public static void main(String[] args) {
        System.out.println(new Foo().b()); // Hello World!
        System.out.println(new Bar().b()); // Hello World!
        System.out.println(new Baz().b()); // Bonjour le monde!
    }
}



/*
A. Hello world!
*** NoSuchMethodError

B. Bonjour le monde!
Bonjour le monde!
Bonjour le monde!

C. Hello world!
Bonjour le monde!
Bonjour le monde!

D. Hello world!
Hello world!
Hello world!

E. Hello world!
Bonjour le monde!
Bonjour le monde!
*/