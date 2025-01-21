class Animal { }
class Dog extends Animal { }
class Petdog extends Dog { }
class House <A extends Animal>{
    @Override
    public String toString() {
        return "House instance";
    }

    public House<? super Dog> build(A a){
        // insert code here
        //A
        return new House<Animal>();

        //B
        //return new House<Dog>();

        //C
        //return new House<Petdog>();

        //D
        //return new House<House>();

        //E
        //return new House<Object>();
    }
}
public class Q188 {
    public static void main(String[] args) {
        House<Dog> house = new House<>();
        House<? super Dog> builtHouse = house.build(new Dog());
        System.out.println("House built successfully: " + builtHouse.toString());
    }
}

//A、B
/*
Which two statements inserted independently on line 3 will make this code compile? (Choose two.)
A. return new House<Animal>();
B. return new House<Dog>();
C. return new House<Petdog>();
D. return new House<House>();
E. return new House<Object>();
*/