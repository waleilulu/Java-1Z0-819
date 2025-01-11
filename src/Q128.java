public class Q128 {
    /*
    module citizen{
        exports com.name to greeting;

        module greeting{

        }
    }
    */
}
//B 。 com.name 套件中的 public 成員僅能被 greeting 模組存取。
/*
Which statement is true?
A. All members of com.name are accessible only to the citizen and greeting modules.
B. public members in the com.name package are accessible only to the greeting module.
C. Inserting "requires citizen" at greeting's module-info.java, enables com.name members accessible to the greeting module.
D. All members in the com.name package are accessible only to the greeting module.
E. public members in the com.name package are accessible to all modules.
*/