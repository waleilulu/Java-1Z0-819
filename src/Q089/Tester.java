package Q089;

public class Tester {
    public static Person createPeople(){
        Person jane = new Person("Jane");
        Person john = new Person("John", jane);
        return jane;
    }
    public static Person createPerson(Person person){
        person = new Person("Jack", person);
        return person;
    }
    public static void main(String[] args) {
        Person person = createPeople();
        /* line 1 */ System.out.println("After createPeople: " + person); 
        person = createPerson(person);
        /* line 2 */ System.out.println("After createPerson: " + person); 
        String name = person.toString();
        System.out.println(name);
    }
}

//C，在 createPeople() 方法中，jane 被創建並返回。 在 createPerson() 方法中，jane 作為 "Jack" 物件的子物件被傳遞。當 person 變量被賦值為 "Jack" 時，jane 被 john 物件引用，所以 jane 並不會被垃圾回收。jane 會在 john 被丟失後才可能被垃圾回收。

/*
Which statement is true?
A. The memory allocated for Jack object can be reused in line 2.
B. The memory allocated for Jane object can be reused in line 1.
C. The memory allocated for Jane object can be reused in line 2.
D. The memory allocated for John object can be reused in line 1.
*/
