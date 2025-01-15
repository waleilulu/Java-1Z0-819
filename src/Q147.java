import java.util.Locale;

public class Q147 {
    public static void main(String[] args) {
        //Locale 類別是 Java 中用於表示地區設置的類別。它包含語言、國家/地區和變體等資訊。
        Locale locale;

        // 使用 Locale 類別的建構子
        locale = new Locale("en", "GB"); // C
        System.out.println(locale); // en_GB

        // 使用 Locale 類別的靜態方法
        locale = Locale.getDefault(); // E
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