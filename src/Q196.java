import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Q196 {
    public static void main(String[] args) {
    // 指定 Locale 為英文（美國）
    Locale l = new Locale("en", "US");
    LocalDate today = LocalDate.of(2018, 12, 17);

    // 使用指定 Locale 
    //Locale 並非 "en", "US"，而是基於您的作業系統語言環境（例如，可能是 "zh", "TW")，所以符合題目要設為美國後面要加上.withLocale(l)
    String mToday = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(l));
    String sToday = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(l));

    
    System.out.println(mToday);
    System.out.println(sToday);
    
}
}

//D
/*
What is the result?
A. December 17, 2018 -
12/17/18

B. 12/17/18
Dec 17, 2018

C. Friday, December 17, 2018 -
December 17, 2018

D. Dec 17, 2018 -
12/17/18
*/