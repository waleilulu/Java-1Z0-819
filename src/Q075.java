public class Q075 {
    public static String ALPHA = "alpha";
    protected String beta = "beta";
    private final String delta;

    public Q075(String d){
        delta = ALPHA + d;
    }

    public String q075(){
        return beta += delta;
    }
}

/*
Which change would make Q075 more secure?
A. public String beta = "beta"; //這會讓 beta 成為 公開的，這意味著它可以被任何類別存取並修改，這樣會使程式的安全性變差。
B. public static final String ALPHA = "alpha"; //這會讓 ALPHA 變成常數（final），這樣一來它就無法被修改，但仍然是公開的，這樣任何類別都能存取它。 雖然常數（final）防止了修改，但公開的變數可能還是會暴露不必要的資訊或讓它被不當存取。
C. private String delta; //這會讓 delta 變成私有但非常數（final），意味著它可以在物件內部被修改。這樣做會讓 delta 變得可以被修改，降低了程式的安全性。
D. protected final String beta = "beta";這會讓 beta 成為 受保護且最終的，這意味著它仍然可以被子類別訪問，但不能被修改。 這樣的設計比較安全，因為它限制了對 beta 的修改，並且避免了外部類別隨意修改這個變數。
*/