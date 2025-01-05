public class Q082 {
    
}

//D，暴露 com.company.clients 包中的所有類和接口給其他模組使用。這樣，其他模組（例如 sales-8.10.jar）可以使用 com.company.clients 包中的類和接口，而無需額外的設置。

/*
A company has an existing Java app that includes two Java 8 jar files, sales-8.10.jar and clients-10.2.jar.
The jar file, sales-8.10.jar, references packages in clients-10.2.jar, but clients-10.2.jar does not reference packages in sales-8.10.jar.
They have decided to modularize clients-10.2. jar.
Which module-info.java file would work for the new library version clients-10.3.jar?

目前情況:
有兩個 JAR 檔案：sales-8.10.jar 和 clients-10.2.jar。
sales-8.10.jar 依賴 clients-10.2.jar 中的包，但是 clients-10.2.jar 不依賴 sales-8.10.jar。
現在想要對 clients-10.2.jar 進行模組化，並生成新的 JAR 檔案 clients-10.3.jar。

A. module com.company.clients{
requires com.company.clients;
}
B. module com.company.clients{
uses com.company.clients;
}
C. module com.company.clients {
exports com.company.clients.Client;
}
D. module com.company.clients {
exports com.company.clients;
}
*/