import java.text.NumberFormat;
import java.util.Locale;

public class Q006 {
    public static void main(String[] args) {
        Locale locale = Locale.US;
        

        //NumberFormat formatter = NumberFormat.getInstance(locale).getCurrency();
        //NumberFormat formatter = NumberFormat.getCurrency(locale);
        //NumberFormat formatter = NumberFormat.getInstance(locale); //進行一般數字格式化
        NumberFormat formatter = NumberFormat.getCurrencyInstance(locale); // 進行貨幣格式化
        
        
        double currency=1_00.00;
        System.out.println(formatter.format(currency));
    }
}

/*
 * 若要格式化為貨幣，請使用：
    NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);
 */