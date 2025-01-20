package Q185;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Box implements Serializable {
    private int boxId;
    private String size;
    private List<Item> items;

    // 建構子
    public Box(int boxId, String size, List<Item> items) {
        this.boxId = boxId;
        this.size = size;
        this.items = items;
    }
}

//class Item
class Item implements Serializable { //C，在class Item後面加上implements Serializable，來實現 Serializable 介面
    private int id;
    private String name;

    // 建構子
    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Q185 {
    public static void main(String[] args) {
        List<Item> items1 = new ArrayList<>();
        items1.add(new Item(1, "Pen"));
        items1.add(new Item(2, "Ruler"));
        Box b1 = new Box(123, "s", items1);

        try (FileOutputStream fout = new FileOutputStream("D:/Gjun_java/Java OCP/1Z0-819/examtopic_819/src/Q185/boxser.txt");
             ObjectOutputStream out = new ObjectOutputStream(fout);) {
            out.writeObject(b1);
            out.flush();
            out.close();
        } catch (Exception e) {
            System.out.println("Unable to Serialize");
        }
    }
}


//C，要序列化 Box 物件，Box 類和其包含的 Item 類都必須實現 Serializable 介面。
/*
 * Which action serializes the b1 object?
 * A. Handle NotSerializableException in the try clause or throw in the main()
 * method definition.
 * B. Add SerialVersionUID to the Box and Item class.
 * C. Implement the Serializable interface in the Item class.
 * D. Override readObject() and writeObject() methods in the Book class.
 * E. Remove out.flush() method invocation.
 */
