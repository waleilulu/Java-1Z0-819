package Q008;
import java.net.Socket;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;

public class Q008_demo {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        String hostname = "localhost";  // 設定主機名稱
        int portNumber = 8080;          // 設定埠號

        try {
            AccessController.doPrivileged((PrivilegedExceptionAction<Void>) () -> {
                Socket transportSocket = new Socket(hostname, portNumber);
                System.out.println("Socket created: " + transportSocket);
                return null;
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/*
A. privilege escalation attack against the OS running the customer code，這選項不正確，因為這段程式碼並沒有涉及到提升對操作系統的權限或嘗試獲取更高權限的操作
B. SQL injection attack against the specified host and port，這選項不正確，因為這裡的程式碼只處理 Socket 連接，並沒有涉及 SQL 資料庫的相關操作或可能引起 SQL 注入的情況。
C. XML injection attack against any mlib server，這選項不正確，因為程式碼中沒有任何與 XML 處理相關的操作，所以不會發生 XML 注入攻擊。
D. none because the customer code base must also be granted SocketPermission，這選項不正確，因為雖然客戶端的代碼可能需要 SocketPermission，但在這個案例中，授權的範圍過於廣泛，允許連接到任何主機和端口，仍然可能導致拒絕服務攻擊。
E. denial of service attack against any reachable machine，E 是最正確的，因為它指出了此類權限設定下的實際風險，即可能對可達的機器發動拒絕服務攻擊。

 */
