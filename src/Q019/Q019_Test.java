package Q019;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class Q019_Test {
    public static void main(String[] args) {
        
        //A.
        /*
        ResourceBundle Q019 = ResourceBundle.getBundle("/Q019/messages", new Locale("ja","JP"));
        Object[] names = ("Joe", "Jane");
        String message = MessageFormat.format(Q019.getString("message"),names);
        */
        
        //B.
        /*
        ResourceBundle Q019 = ResourceBundle.getBundle("Q019.messages", Locale.JAPAN);
        Object[] names = ("Joe", "Jane");
        String message = MessageFormat.format(Q019.getString("message"),names);
        */

        //C. 
        Locale.setDefault(Locale.JAPAN);
        //家載資源包
        ResourceBundle messages = ResourceBundle.getBundle("Q019/messages", Locale.JAPAN);

        
        //ResourceBundle messages = ResourceBundle.getBundle("messages");
        String message = MessageFormat.format(messages.getString("message"),"Joe", "Jane");
        
        // ResourceBundle messages = ResourceBundle.getBundle("messages");
        // String formattedMessage = MessageFormat.format(messages.getString("message"), "Joe", "Jane");
        

        //D. 
        /*
        ResourceBundle msg = ResourceBundle.getBundle("messages", Locale.JAPAN);
        String[] names = ("Joe", "Jane");
        String message = MessageFormat.format(Q019.getString("message"),names);
        */
        System.out.println(message);
    }
}
