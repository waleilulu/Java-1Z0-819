import java.util.Locale;

public class Q147 {
    public static void main(String[] args) {
        Locale locale;

        // 正確的選項
        locale = new Locale("en", "GB"); // 選項 C
        System.out.println(locale); // en_GB

        locale = Locale.getDefault(); // 選項 E
        System.out.println(locale); // en_TW
    }
}


//C、E
/*
Which two assignments create Locale instances? (Choose two.)
A. locale = "fr_FR";
B. locale = "en-USA";
C. locale = new Locale("en", "GB");
D. locale = Locale.getAvailableLocales();
E. locale = Locale.getDefault();
*/