public class Q205 {
    /* line n1 */ 
    //A
    static class A extends Throwable{

    //B
    // static class A extends Exception {
    
    //C
    // static class A extends ArithmeticException {
    
    //D
    // static class A extends RuntimeException {
        
        A(){
        super ("The Mandatory Criteria Yet to Meet");
        }
    }    
    public static void main(String[] args) throws A{
        int a = 10, b = 13;
        try {
            if(a < b){ // line 19
                System.out.println("Condition is true. Throwing exception...");
                throw new A(); // line 20
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Continue...");
    }
}

// A，Throwable 是所有錯誤和異常的超類。它本身是 checked exception，因此必須被 try-catch 或 throws 處理。在這種情況下，A 會繼承 Throwable，並且在 main 方法中 throws A，符合要求：當 a < b 為真時，會拋出 A 並終止程式。
// B、C、D都會繼續程式輸出Continue...

/*
You must define the A exception class. The program execution must be terminated if the condition at line 19 is true and an A exception is thrown
at line 20.
Which code fragment at line n1 defines A as per the requirement?
A. class A extends Throwable {
B. class A extends Exception {
C. class A extends ArithmeticException {
D. class A extends RuntimeException {
*/