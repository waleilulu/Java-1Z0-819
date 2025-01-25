public class Q198 {

//B
/*
Examine:
Class.forName(JDBC_DRIVER_CLASS_NAME);


Class.forName() 方法的作用是動態加載指定的類到 JVM 中。
例如: Class.forName("com.mysql.cj.jdbc.Driver");這樣會確保 JDBC 驅動類被加載到內存中，並執行其靜態塊（如果有），從而完成 JDBC 驅動的初始化。

When is it necessary to execute this statement?
A. It must be executed once and only before the first call to DriverManager to get a Connection using the named JDBC driver.
B. It is no longer required to execute this method. 對於 JDBC 4.0 及更新版本，此選項是正確的，因為驅動程序會自動註冊。
C. It must be executed before each call to DriverManager to get a Connection using the named JDBC driver.
D. It must be executed once and before accessing the named JDBC driver in any way.     
*/
}
