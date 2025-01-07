public class Q095 {
    /*
    public interface API { //line 1
    */
    //E，line 1 改成以下 
    public abstract class API {

    /*
    public void checkValue(Object value)
                throws IllegalArgumentException; //line2
    */
    //B，line 2 改成以下 
    public abstract void checkValue(Object value)
                throws IllegalArgumentException;


    public boolean isValueANumber(Object val){
        if(val instanceof Number){
            return true;
        }else{
            try {
                Double.parseDouble(val.toString());
                return true;
            } catch (NumberFormatException ex) {
                return false;
            }
        }
    }
        
    }
}

//B、E

/*
Which two changes need to be made to make this class compile? (Choose two.)
A. Change Line 1 to a class:
public class API {

B. Change Line 2 to an abstract method:
public abstract void checkValue(Object value)
throws IllegalArgumentException;

C. Change Line 2 access modifier to protected:
protected void checkValue(Object value)
throws IllegalArgumentException;

D. Change Line 1 to extend java.lang.AutoCloseable:
public interface API extends AutoCloseable {

E. Change Line 1 to an abstract class:
public abstract class API {
*/
