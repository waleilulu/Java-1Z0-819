public class Q011 {

}

/*
 * module-info.java
 
 * module PrintServiceProvider {
 * requires PrintServiceAPI; // 需要 PrintServiceAPI 模組
 * provides org.printservice.spi.Print with com.provider.PrintService; // 提供
 * Print 服務的實現
 * }
 * 
 * 
 * 
 * A. module PrintServiceProvider {
 * requires PrintServiceAPI;
 * exports org.printservice.spi;
 * }
 * 
 * 選擇 B 是正確的，並確保所有相關的實現類和接口存在於正確的包中。
 * B. module PrintServiceProvider {
 * requires PrintServiceAPI;
 * provides org.printservice.spi.Print with
 * com.provider.PrintService;
 * }
 * 
 * C. module PrintServiceProvider {
 * requires PrintServiceAPI;
 * uses com.provider.PrintService;
 * }
 * 
 * D. module PrintServiceProvider {
 * requires PrintServiceAPI;
 * exports org.printservice.spi.Print with
 * com.provider.PrintService;
 * }
 */
