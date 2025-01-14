class Person {
    private String name;
    public Person(String name) {
        this.name = name;
    }
    
    public String toString() {
        return name;
    }  
}

public class Q143 {
    static Person p = null;
    public static void main(String[] args) {
        p = checkPerson(p);
        System.out.println(p); // Mary
        Person p1 = new Person("Joe");
        p1 = checkPerson(p);
        System.out.println(p1); // Mary
    }
    public static Person checkPerson(Person p) {
        if(p == null) {
            p = new Person("Mary");
        }
        return p;
    }
}

//B
/*
What is the result?
A. Marry -
Joe
B. Mary -
Mary
C. null
null
D. Joe -
Joe
*/