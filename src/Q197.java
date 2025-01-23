// 多型（Polymorphism） 和 陣列類型不相容問題
class A{ // class A 是基底類別，包含 print() 方法。
    public void print(){
        System.out.println("A");
    }
}

// class B 和 class C 都繼承自 class A，並覆寫了 print() 方法。
class B extends A{
    public void print(){
        System.out.println("B");
    }
}
class C extends A{
    public void print(){
        System.out.println("C");
    }
}

public class Q197 {
    public static void main(String[] args) {
        A[] values = new B[2]; // 這是允許的，因為 B[] 是 A[] 的一種特化形式。宣告了一個基於類型 A 的陣列，但實際上該陣列是由 B 類型元素構成。這種陣列可以接受任何 B 類型的物件，但不能接受非 B 類型的物件（即使是 A 的其他子類）。
        values[0] = new C(); // 發現 new C() 並非 B 類型，從而拋出 ArrayStoreException。試圖將 C 類型的物件放入 B[] 陣列。即使 C 是 A 的子類，但 C 與 B 沒有直接繼承關係，因此會導致 陣列類型不相容 的問題。
        values[0].print();
    }
}

//A，Exception in thread "main" java.lang.InstantiationError: C

/*
What is the result?
A. The program throws an exception.
B. The program prints: A
C. The program prints: C
D. The program fails to compile.
*/