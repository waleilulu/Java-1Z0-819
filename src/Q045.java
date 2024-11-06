class Super {
    static String greeting() {
        return "Good Night";
    }

    String name() {
        return "Harry";
    }

}

class Sub extends Super {
    static String greeting() {
        return "Good Morning";
    }
    String name(){
        return "Potter";
    }
}

public class Q045 {
    public static void main(String[] args) {
        Super s = new Sub();
        System.out.println(s.greeting() + ", " + s.name());
    }
}

/*
1. 靜態方法的覆蓋（Static Method Hiding）
在 Java 中，靜態方法是隱藏（hiding）而不是覆蓋（overriding）的。當子類中定義了一個靜態方法，它並不會覆蓋父類中的靜態方法，而是隱藏它。這意味著，靜態方法的調用是根據引用類型來決定的，而不是根據實際對象的類型。
在這道題中，Super 類和 Sub 類中都有一個靜態方法 greeting()。雖然 Sub 類有一個與父類相同簽名的靜態方法，但這並不會覆蓋父類的方法。靜態方法是根據引用類型來決定使用哪一個方法。因此，在 Super s = new Sub(); 中，s.greeting() 會調用父類 Super 中的 greeting() 方法，而不是 Sub 類中的 greeting() 方法。

2. 實例方法的覆蓋（Instance Method Overriding）
相對於靜態方法，實例方法是可以被覆蓋的。當子類中有一個與父類相同簽名的實例方法時，會根據實際對象的類型來決定調用哪一個方法。這是一種運行時的多型行為。
在這道題中，name() 方法是實例方法，並且 Sub 類覆蓋了 Super 類中的 name() 方法。因此，s.name() 會調用 Sub 類中的 name() 方法，而不是 Super 類中的 name() 方法。

*/

//Good Night, Potter

/*
What is the result?
A. Good Night, Harry
B. Good Morning, Potter
C. Good Morning, Harry
D. Good Night, Potter
*/