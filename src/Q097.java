public class Q097 {
    public interface AdaptorFirst{
        void showFirst();
    }
    
    //Which three classes successfully override showFirst()? (Choose three.)
    //A、B、E
    
    //A
    public class MainClassA implements AdaptorFirst{
        public void showFirst(){
            System.out.println("first");
        }
    }
    //B
    public abstract class MainClassB implements AdaptorFirst {
        public abstract void showFirst();
    }
    //C
    /*
    public abstract class MainClassC implements AdaptorFirst {
        public String showFirst() {
            return "first";
        }
    }
    */
    //D
    /*
    public class MainClassD implements AdaptorFirst {
        void showFirst();
    }
    */
    //E
    public abstract class MainClassE implements AdaptorFirst {
        public void showFirst() {
        System.out.println("first");
        }
    }
    //F
    /*
    public class MainClassF implements AdaptorFirst {
        private void showFirst() {
        System.out.println("first");
        }
    }
    */
}