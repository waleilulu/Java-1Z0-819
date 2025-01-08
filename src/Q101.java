public class Q101 {
    class L extends Exception {}
    class M extends L {}
    class N extends RuntimeException {}
    public void p() throws L {throw new M();}
    public void q() throws N {throw new N();}
    public static void main(String[] args) {
        try {
            Q101 t = new Q101();
            t.p();
            t.q();
        } 
        /* line 1 */ 
        //A 
        //catch(M | L e)
        //B
        catch(L e)
        //C 
        //catch(N | L | M e)
        //D
        //catch(L | N e)
        //E
        //catch(L | M | N e)
        {
            System.out.println("Exception caught");
        }
    }
}

//B，但D也可以編譯過
/*
What change on line 1 will make this code compile?
A. Add catch(M | L e)
B. Add catch(L e)
C. Add catch(N | L | M e)
D. Add catch(L | N e)
E. Add catch(L | M | N e)
*/