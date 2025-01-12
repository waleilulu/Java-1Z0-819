import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.JDBCType;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Q130 {

    /* Given the data of the EMP table: */
    /*
    ID      NAME        DEPT
    101     SMITH       HR
    102     JONES       ENG
    103     WEAVER      HR
    */
    public static void main(String[] args) {
        String jdbcURL = "your_jdbc_url";
        String username = "your_username";
        String password = "your_password";

        try(Connection conn = DriverManager.getConnection(jdbcURL, username, password);
        PreparedStatement query = conn.prepareStatement("SELECT ID, NAME* FROM EMP WHERE DEPT = ?");
        PreparedStatement update = conn.prepareStatement("INSER INTO RECRUITING (ID, NAME) VALUES (?, ?)")) {
        
        query.setString(1, "HR");
        ResultSet rs = query.executeQuery();
        while (rs.next()) {
            update.setObject(1, rs.getObject(1, Integer.class), JDBCType.INTEGER);
            update.setObject(2, rs.getObject(2, String.class), JDBCType.VARCHAR);
            update.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
/*
Which two happen upon execution? (Choose two.)
//B、C

A. Three SQL statements are executed. 錯誤。程式碼中只有兩個 SQL 語句被執行：一個是 SELECT 語句，另一個是 INSERT 語句。INSERT 語句會根據 ResultSet 中的行數被多次執行，但這仍然是同一個 SQL 語句。
B. Two PreparedStatement objects are created. 正確。程式碼中創建了兩個 PreparedStatement 對象：一個是 query，另一個是 update。
C. Two SQL statements are executed. 正確。程式碼中執行了兩個 SQL 語句：一個是 SELECT 語句，另一個是 INSERT 語句。
D. Memory leaks because Connection, PreparedStatements, and ResultSet are not closed. 錯誤。程式碼使用了 try-with-resources 語句，這確保了 Connection 和 PreparedStatement 會自動關閉。ResultSet 會在 PreparedStatement 關閉時自動關閉。
E. Three PreparedStatement objects are created. 錯誤。程式碼中只創建了兩個 PreparedStatement 對象。
F. A SQLException is thrown because the ResultSet is not closed. 錯誤。ResultSet 會在 PreparedStatement 關閉時自動關閉，因此不會因為 ResultSet 未關閉而拋出 SQLException。
*/