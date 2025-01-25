// 定義自訂的 Resource 註解
@interface Resource {
    String value() default "Customer1";
    // E要符合需要改成 String[] value() default "Customer1";
}

// Examine this code fragment:

// 使用 Resource 註解的類
/* Loc1 */
//A
//@Resource("Customer2")

//B
//@Resource(value="Customer2")

//C
//@Resource

//D，錯誤，不能寫成val，要寫成value
//@Resource(val="Customer2")

//E，錯誤，回傳值要改才可以編譯
//@Resource({"Customer2"})
class ProcessOrders {
    // 類的內容
    void process() {
        System.out.println("Processing orders...");
    }
}

// 測試類
public class Q201 {
    public static void main(String[] args) {
        // 檢查 ProcessOrders 類是否有註解
        if (ProcessOrders.class.isAnnotationPresent(Resource.class)) {
            Resource resource = ProcessOrders.class.getAnnotation(Resource.class);
            System.out.println("Resource value: " + resource.value());
        }
    }
}

//A、B、C
/*
Which two annotations may be applied at Loc1 in the code fragment? (Choose two.)
A. @Resource("Customer2")
B. @Resource(value="Customer2")
C. @Resource
D. @Resource(val="Customer2")
E. @Resource({"Customer2"})
*/