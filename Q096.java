public class Q096 {
    public interface A {
        abstract void x();
        public default void y(){

        }        
    }
    public abstract class B{
        public abstract void z();
    }
    public class C extends B implements A{
        /* insert code here */
        //A
        public void x() { }
        public void z() { }

        //B
        /*
        public void x() { }
        protected void y() { super.y(); }
        public void z() { }
        */

        //C
        /*
        void x() { }
        public void y() { }
        public void z() { }
        */

        //D
        /*
        void x() { super.y(); }
        public void z() { }
        */

        //E
        /*
        void x() { }
        public void z() { }
        */
    }
}

//A
/*
What code inserted into class C would allow it to compile?
A. public void x() { }
public void z() { }

B. public void x() { }
protected void y() { super.y(); }
public void z() { }

C. void x() { }
public void y() { }
public void z() { }

D. void x() { super.y(); }
public void z() { }

E. void x() { }
public void z() { }
*/