import java.util.ServiceLoader;

public class Q051 {
    
    // 定義 Print 介面
    public interface Print {
        void printMessage(String message);
    }

    // 實作 Print 介面的服務提供者
    public static class PrintServiceImpl implements Print {
        @Override
        public void printMessage(String message) {
            System.out.println("PrintServiceImpl: " + message);
        }
    }

    public static void main(String[] args) {
        // 載入 Print 介面的服務提供者
        ServiceLoader<Print> loader = ServiceLoader.load(Print.class); //ServiceLoader.load(Print.class) 是載入服務提供者的正確方式。

        // 迭代所有載入的服務提供者並調用其 printMessage 方法
        for (Print printService : loader) {
            printService.printMessage("這是來自服務提供者的訊息！");
        }
    }
}

//A

/*
Which code fragment does a service use to load the service provider with a Print interface?
A. private java.util.ServiceLoader loader = ServiceLoader.load(Print.class)
B. private Print print = new com.service.Provider.PrintImpl();
C. private java.util.ServiceLoader loader = new java.util.ServiceLoader<>()
D. private Print print = com.service.Provider.getInstance();
*/