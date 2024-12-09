public class Q067 {
    enum Alphabet{
        A, B, C;
        //A，印出B，[0]才會是A
        /*
        static String getFirstLetter() {
             return Alphabet.values()[1].toString();
        }
        */
        //B
        static String getFirstLetter()
        {
            return A.toString();
        }
        
        //C，這個方法是非靜態的（final 且沒有 static），所以不行
        /*
        final String getFirstLetter() { 
            return A.toString(); 
        }
        */
        //D，這個方法是非靜態的，所以不行
        /*
        String getFirstLetter() { 
            return A.toString(); 
        }
        */
    }
    public static void main(String[] args) {
        System.out.println(Alphabet.getFirstLetter());
    }
}

//What code should be written at line 3 to make this code print A?
