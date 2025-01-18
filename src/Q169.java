interface A{
    abstract void x();
}
abstract class B /* position 1 */ 
{
    /* position 2 */
    public void x(){}
    public abstract void z();
}

public class Q169 extends B implements A{
    /* position 3 */
    //C
    // @Override
    // void x(){}
    // @Override
    // public void z(){}

    //D
    public void z(){}
}


//D
//Which code, when inserted at one or more marked position, would allow classes B and C to compile?
//A
//implements A //position 1
//@Override //position 2

//B
//@Override //position 2
//public void z(){} //position 3

//C
//@Override //position 3
//void x(){} //position 3
//@Override //position 3
//public void z(){} //position 3

//D
//public void z(){} //position 3

