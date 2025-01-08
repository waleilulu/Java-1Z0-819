public class Q102 {
    static String prefix = "Modial:";
    private String name = "domainmodel";
    public static String getName(){
        return new Q102().name;
    }
    public static void main(String[] args) {
        Q102 m = new Q102();
        //System.out.println(/* Insert code here */);
        //A
        //System.out.println(Q102.prefix + Q102.name);

        //B
        //System.out.println(prefix + getName);

        //C
        System.out.println(Q102.prefix + Q102.getName()); //Modial:domainmodel

        //D
        System.out.println(new Q102().prefix + new Q102().name); //Modial:domainmodel

        //E
        //System.out.println(prefix + name);

        //F
        //System.out.println(prefix + Q102.name);
    }
}

//C、D
/*
Which two code snippets inserted independently inside println method print Mondial:domainmodel? (Choose two.)
A. Main.prefix + Main.name
B. prefix + getName
C. Main.prefix + Main.getName()
D. new Main().prefix + new Main().name
E. prefix + name
F. prefix + Main.name
*/