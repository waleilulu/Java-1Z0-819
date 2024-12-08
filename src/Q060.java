public class Q060 {

}
// D：你應該拒絕這個更改，因為 -noverify 是一個關鍵的安全風險。 
//-noverify 這個選項會禁用 Java 虛擬機（JVM）在啟動時對類文件的驗證。通常，JVM 會在加載字節碼時進行一些驗證，以確保這些類的完整性和安全性。如果使用了 -noverify，JVM 就不會對這些類進行驗證，這會使得代碼更容易遭遇安全漏洞或攻擊（例如，通過修改字節碼來運行不安全的代碼）。這是一個潛在的安全風險，因此不建議在生產環境中使用這個選項。
/*
Your organization provides a cloud server to your customer to run their Java code. You are reviewing the changes for the next release and you see
this change in one of the config files:
old: JAVA_OPTS="$JAVA_OPTS -Xms8g -Xmx8g"
new: JAVA_OPTS="$JAVA_OPTS -Xms8g -Xmx8g -noverify"
Which is correct?
A. You accept the change because -noverify is necessary for your code to run with the latest version of Java.
B. You reject the change because -Xms8g -Xmx8g uses too much system memory.
C. You accept the change because -noverify is a standard option that has been supported since Java 1.0.
D. You reject the change because -noverify is a critical security risk
*/