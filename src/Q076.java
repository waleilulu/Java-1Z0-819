public class Q076 {
    public interface ExampleInterface{ 
        public String methodD(); //A
        //public int x;
        /*
        final void methodG(){
            System.out.println("G");
        }
        */
        //final void methodE();    
        public abstract void methodB(); //E
        /*
        public void methodF(){
            System.out.println("F") ;
            }
        */
        //private abstract void methodC();
    }
}

//A、E
/*
Which two statements are valid to be written in this interface? (Choose two.)
A. public String methodD();
B. public int x;
C. final void methodG(){
System.out.println("G");
}
D. final void methodE();
E. public abstract void methodB();
F. public void methodF(){
System.out.println("F") ;
}
G. private abstract void methodC();
*/

/*
介面中的方法和變數規則
介面中的方法預設是 public abstract，所以方法可以省略 public 和 abstract 修飾符。
介面中的變數預設是 public static final，所以變數必須是 public、static 和 final，並且需要初始化。
介面中的方法 不能有具體實作（除非它是 default 或 static 方法），所以不能有方法體。
*/
