public class Q113 {
    //Which code fragment added to line 1 enables the code to compile and print Hello Joe?
    // line 1
    
    //A
    // interface Greeting{
    //     public default void greet(String name){
    //         System.out.println(greet + name);
    //     }
    // }
    
    //B
    // class Greeting{
    //     public static void greet(String s){
    //         System.out.println("Hello " + s);
    //     }
    // }

    //C
    class Greeting{
        private void greet(String name){
            System.out.println("Hello " + name);
        }
    }
    
    //D
    // static class Greeting{
    //     public void greet(String name){
    //         System.out.println("Hello " + name);
    //     }
    // }

    public static void main(String[] args) {
        new Q113().new Greeting().greet("Joe");
    }
}

//C，可印出Hello Joe