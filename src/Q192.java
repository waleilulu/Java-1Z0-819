import java.util.ArrayList;
import java.util.List;

class Person{
    String name; // 基本資訊，只有一個屬性 name
    public Person(String name){ // 提供了一個帶參數的建構函式，用於初始化名字。
        this.name = name;
    }
    public String toString(){ // 覆寫了 toString() 方法，返回 name 值。
        return name;
    }
}

class Employee extends Person{ // 繼承自 Person 類，表示一個員工。
    Manager manager; // 新增一個屬性 manager，用於記錄該員工的主管。
    public Employee(String name){ // 提供建構函式，接受名字參數並傳遞給父類。
        super(name);
    }
    public String toString(){ // 覆寫 toString() 方法，除了返回名字外，還加上了主管資訊（若沒有主管則顯示 None）。
        String managerStr = this.manager == null? "None" : this.manager.toString();
        return super.toString() + " Manager: " + managerStr;
    }
}

class Manager extends Employee{ // 繼承自 Employee 類，表示一位主管。
    List reports = new ArrayList<>(); // 新增一個屬性 reports，用於記錄該主管的所有直接下屬（Employee 的列表）。
    public Manager (String name, Employee... reports){ // 第一個建構函式：初始化 Manager 對象，指定名字和下屬（不指定主管）。
        this(name, null, reports);
    }
    public Manager (String name, Manager manager, Employee... reports){ // 第二個建構函式：初始化 Manager 對象，指定名字、主管和下屬。
        super(name);
        this.manager = manager;
        for(Employee employee : reports){ // 將每個下屬的 manager 屬性設置為該 Manager，並將這些下屬加入 reports 列表。
            employee.manager = this;
        }
        this.reports.addAll(List.of(reports)); 
    }
    public String toString(){ // 覆寫 toString() 方法，除了返回員工基本資訊外，還加上直接下屬的人數。
        return super.toString() + " Reports: " + reports.size();
    }
}

public class Q192 {
    public static void main(String[] args) {
        Manager manager = new Manager("AA", new Employee("BB"), new Employee("CC"));
        /*
        創建兩個 Employee 對象：
        Employee("BB") 和 Employee("CC") 分別初始化名字為 BB 和 CC 的員工。

        創建一個 Manager 對象：
        Manager("AA", new Employee("BB"), new Employee("CC"))
        該 Manager 名為 AA，有兩個下屬：BB 和 CC。
        在建構過程中，BB 和 CC 的 manager 屬性被設置為 AA，並且 AA.reports 列表包含這兩個下屬。
        */
        System.out.println(manager); // AA Manager: None Reports: 2
    }
}


/*
此程式展示了繼承與多態的使用。
使用了可變參數（Employee... reports）來簡化多個參數的處理。
通過覆寫 toString() 方法，實現了不同類型物件的自描述功能。
*/

//B
/*
What is the result?
A. nothing
B. AA Manager: None Reports: 2
C. AA
D. AA Manager: None
E. A java.lang.NullPointerException is thrown.
*/