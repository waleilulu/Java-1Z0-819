public class Q084 {
    
}
//B 為正確的連線方式。如果資料庫需要身份驗證，則可以將使用者名稱和密碼作為額外的參數提供給 getConnection() 方法，DriverManager.getConnection("jdbc:derby:com", "J_SMITH", "dt12%2f3");


/*
Assuming the user credentials are correct, which expression will create a Connection?
A. DriverManager.getConnection("http://database.jdbc.com", "J_SMITH", "dt12%2f3")
B. DriverManager.getConnection("jdbc:derby:com")
C. DriverManager.getConnection("jdbc.derby.com")
D. DriverManager.getConnection()
E. DriverManager.getConnection("J_SMITH", "dt12%2f3")
*/