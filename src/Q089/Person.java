package Q089;

public class Person {
    private String name;
    private Person child;
    
    public Person (String name, Person child){
        this(name);
        this.child = child;
    }
    public Person(String name) {
        this.name = name;
    }    

    public String toString(){
        return name + " " + child;
    }
}