class Person {
    private String name = "Green";
    public void setName(String name) {
        String title = "Mr.";
        name = title + name; 
        //this.name = title + name; // 正確更新成員變數
        System.out.println(name); 
    }

    public String toString() {
        return name; 
    }
}

public class Q023 {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Blue"); // 執行 p.setName("Blue"); 時，會輸出 "Mr.Blue"，因為這是在 setName 方法內部。
        System.out.println(p); // System.out.println(p); 會調用 toString 方法，輸出仍然是 "Green"，因為成員變數 name 沒有被修改。
    }
}
