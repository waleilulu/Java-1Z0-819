import java.beans.Statement;
import java.sql.Connection;
import java.sql.JDBCType;
import java.sql.PreparedStatement;

public class Q119 {
    String eName = "Smith";
    String empId = "42";
    
    public void insertData(Connection conn) throws Exception {
    
    // Fragment 1
    Statement stmt = conn.createStatement();
    String sql1 = "INSERT INTO EMP VALUES ('" + eName + "', '" + empId + "')";
    stmt.executeUpdate(sql11);

    
    // Fragment 2
    String sql2 = "INSERT INTO EMP VALUES (?, ?)";
    PreparedStatement pStmt = conn.prepareStatement(sql2);
    pStmt.setObject(1, eName, JDBCType.VARCHAR);
    pStmt.setObject(2, empId, JDBCType.VARCHAR);
    pStmt.executeUpdate();
    }
}
//B，可以防止 SQL 注入攻擊。SQL 注入是一種常見的攻擊方式，攻擊者可以通過插入惡意的 SQL 語句來破壞資料庫。
/*
Which code fragment is preferred and why?
A. Fragment 1 because it is shorter.
B. Fragment 2 because it prevents SQL injection.
C. Fragment 2 because it explicitly specifies the SQL types of the column values.
D. Fragment 1 because it is more performant.
*/