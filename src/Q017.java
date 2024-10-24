public class Q017 {
    public enum Season{
        WINTER('w'), SPRING('s'), SUMMER('h'), FALL('f');
        char c;
        private Season(char c){
            this.c=c;
        }
    }

    public static void main(String[] args) {
        Season[] sA = Season.values();

        //Which three code fragments, at line n1, prints SPRING? (Choose three.)

        //A. 
        System.out.println(Season.valueOf("SPRING").ordinal()); //印出 1

        //B. //編譯不過
        //System.out.println(Season.values(1));
        
        //C. 
        System.out.println(Season.SPRING); //印出 SPRING
        
        //D. 
        System.out.println(Season.valueOf("SPRING")); //印出 SPRING
        
        //E. //編譯不過
        //System.out.println(Season.valueOf('s'));

        //F. 
        System.out.println(sA[0]); //印出 WINTER
        
        //G. 
        System.out.println(sA[1]); //印出 SPRING
    }
}
