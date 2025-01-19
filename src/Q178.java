import java.lang.annotation.Target;

class Person {
    Person() {
        // Default constructor
    }
}

public class Q178 {
    @Target({java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.METHOD})
    @interface Resource{}

    @Resource /* Loc1 */
    class Manager extends /* Loc2 */ Person{
         
        /* Loc3 */
        Manager() {
            super();
        }
        
        @Resource /* Loc4 */ 
        String getDepartmentName(){
            return "Some Department";
        }
        String departmentName; /* Loc5 */ 
    }
}

//C、D
/*
In which two locations is it legal to apply the @Resource annotation? (Choose two.)
A. Loc3
B. Loc5
C. Loc1
D. Loc4
E. Loc2
*/