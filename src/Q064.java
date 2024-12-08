public class Q064 {
    String str;
    private void methodA(){
        System.out.println("methodA");
    }
}

//B
/*
You want to implement the java.io.Serializable interface to the Q064 class.
Which method should be overridden?
A. the readExternal method
B. nothing
C. the readExternal and writeExternal method
D. the writeExternal method
*/



/*
import java.io.*;
// 使 Q064 類實現 Serializable 介面
public class Q064 implements Serializable {
    // 類的屬性會被序列化
    String str;
    
    // 私有方法不會被序列化
    private void methodA() {
        System.out.println("methodA");
    }

    // 類的建構子，用來設置 str 屬性
    public Q064(String str) {
        this.str = str;
    }

    // 主方法：演示如何序列化和反序列化物件
    public static void main(String[] args) {
        // 1. 創建物件並設置屬性
        Q064 object = new Q064("Hello, world!");

        // 2. 序列化物件到檔案
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Q064.ser"))) {
            out.writeObject(object);  // 寫入物件到檔案
            System.out.println("物件已成功序列化！");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 3. 反序列化物件
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("Q064.ser"))) {
            Q064 deserializedObject = (Q064) in.readObject();  // 讀取反序列化物件
            System.out.println("反序列化成功！str = " + deserializedObject.str);  // 顯示物件的 str 屬性
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}




*/