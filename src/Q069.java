public class Q069 {
    @interface Resource{ //定義了一個自訂註解 @Resource，它包含一個元素 value()，其型別是 String[]（一個字串陣列）。也就是說，當你使用 @Resource 註解時，你必須為 value 提供一個字串陣列。
        String[] value();
    }
    /* Loc1 */ 
    //@Resource({"Customer1", "Customer2"}) class ProcessOrders{
    //@Resource(value={{}})class ProcessOrders{
    //@Resource class ProcessOrders{
    @Resource("Customer1") class ProcessOrders{
    //@Resource() class ProcessOrders{
    }
}

//AD
/*
Which two annotations may be applied at Loc1 in the code fragment? (Choose two.)
A. @Resource({“Customer1”, “Customer2”})
    這裡傳遞了兩個字串 ("Customer1" 和 "Customer2")，並用大括號 {} 包起來，這會被解析為一個字串陣列 (String[])。這完全符合 value() 元素的要求。

B. @Resource(value={{}})
    這裡提供了兩組大括號，這會被解析為 String[][]（字串陣列的陣列），而 value() 元素需要的是一個簡單的 String[]（字串陣列），因此這個語法不符合預期。

C. @Resource
   @Resource 註解需要提供 value 元素，而 value 需要一個字串陣列（String[]），這裡並未提供任何值，所以這樣寫會產生錯誤。

D. @Resource(“Customer1”)
    提供的是單一的字串 "Customer1"，但是 value() 元素需要的是字串陣列（String[]）。這樣寫不符合型別要求。

E. @Resource()

*/
