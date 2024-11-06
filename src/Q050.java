public class Q050 {
    public static void main(String[] args) {
        // 可以在這裡創建對接口的實現

        // B.
        InterfaceD d = new InterfaceD() {
            @Override
            public int breed(int x) {
                // 實現 breed 方法，這是唯一的抽象方法
                return x * 2;
            }
        };
        
        // 測試 InterfaceD 的方法
        System.out.println("Breed (InterfaceD): " + d.breed(5));   // 執行 breed 方法，應該輸出 10

        //E.
        InterfaceB b = new InterfaceB() {
            @Override
            public boolean equals(Object o) {
                // 實現 equals 方法
                return o != null && o instanceof InterfaceB;
            }

            @Override
            public int breed(int x) {
                // 實現 breed 方法
                return x * 2;
            }
        };
        
        // 測試一下方法
        System.out.println("GERM: " + b.getGERM());   // 默認會返回 13
        System.out.println("Breed: " + b.breed(5));   // 執行 breed 方法，應該輸出 10
        System.out.println("Equals: " + b.equals(b)); // 比較兩個對象是否相等
    }
    // A.
    // @FunctionalInterface
    // interface InterfaceC {
    //     public boolean equals(Object o); //equals(Object o) 是從 Object 類繼承來的，不會被計算為抽象方法，它仍然需要在實現類中被覆寫。

    //     int breed(int x); //抽象方法
    //     int calculate(int x, int y); //抽象方法

    //     /* 功能性介面只可以有一個抽象方法 */
    // }

    // B.
    @FunctionalInterface
    interface InterfaceD {
        int breed(int x); // 唯一的抽象方法

        /* 功能性介面只可以有一個抽象方法 */
    }

    // C.
    // @FunctionalInterface
    // interface InterfaceE {
    //     public boolean equals(int i); //自定義的抽象方法
    //     int breed(int x); //抽象方法
        
    //     /* 功能性介面只可以有一個抽象方法 */
    // }

    // D.
    // interface InterfaceA {
    //     int GERM = 13; //變數會被自動視為 public static final，即它是常數。接口中的常數是合法的，並不影響接口是否是功能性介面。

    //     public default int getGERM() { //這個 default 方法 getGERM()，這個方法雖然有具體實現，但它並不是抽象方法。
    //         return GERM;
    //     }

    //     /* 這個接口 沒有任何抽象方法，只有一個常數和一個 default 方法。 */
    // }

    // E.
    interface InterfaceB {
        int GERM = 13;
        public default int getGERM() {  //default 方法
            return get(); 
        }
        private int get() {  //私有方法可以幫助 default 方法實現其功能。
            return GERM; 
        }
        public boolean equals(Object o); //equals(Object o) 是從 Object 類繼承來的，不會被計算為抽象方法，它仍然需要在實現類中被覆寫。

        int breed(int x); //它有且只有一個自定義的抽象方法，即 breed(int x)

    }
}
// B、E

/*
功能性介面（Functional Interface）的完整定義
在 Java 中，功能性介面（Functional Interface） 是一個只包含 一個抽象方法 的接口。這些接口可以被用作 Lambda 表達式和方法引用的目標類型。功能性介面是 Java 8 引入的 Lambda 表達式和 Stream API 的基礎。

功能性介面的特徵：
唯一的抽象方法：功能性介面必須只有一個抽象方法。這個抽象方法可以有任意數量的參數和返回類型。
可以包含 default 和 static 方法：功能性介面可以有多個 default 和 static 方法，它們不會影響接口是否是功能性介面，因為這些方法已經提供了具體實現。
可以使用 @FunctionalInterface 註解：這個註解是可選的，但它幫助編譯器檢查接口是否符合功能性介面的要求。若接口有多於一個抽象方法，則編譯器會報錯。
可以擁有來自 Object 類的方法：如 equals(), hashCode(), 和 toString() 等這些已經實現的 Object 類方法，這些不會影響功能性介面的定義。
*/