public class Q083 {
    
}
//D、E
/*
Which two statements are correct about modules in Java? (Choose two.)

A. module-info.java cannot be empty.
B. module-info.java can be placed in any folder inside module-path.
C. By default, modules can access each other as long as they run in the same folder.
D. A module must be declared in module-info.java file. 每個模組都必須有一個 module-info.java 檔案。這個檔案必須至少包含模組名稱，以及其他需要的設定（如 requires、exports 等）。這是 Java 模組系統的基本要求。
E. java.base exports all of the Java platforms core packages. java.base 模組是 Java 的核心模組，導出了所有 Java 平台的核心包，如 java.lang、java.util、java.io 等。所有的模組都可以自動訪問這些核心包。
*/