import java.util.List;

class Item {
    public String name;
    public int count;
    public Item(String name, int count){
        this.name = name;
        this.count = count;
    }    
}

public class Q181 {
    public static void main(String[] args) {
        var item = List.of(new Item("A", 10), 
                           new Item("B", 2), 
                           new Item("C", 12), 
                           new Item("D", 5), 
                           new Item("E", 6)
                           //new Item("F", -5)        //多增加一個F為-5來測試
                          ); 
        
        // line 1
        //A，allMatch 會檢查是否所有元素都滿足條件。
        //if(item.stream().allMatch(i -> i.count < 0)) {

        //B，anyMatch 方法會檢查是否至少有一個元素滿足指定的條件。當條件 (i.count < 0) 成立時，anyMatch 會回傳 true。
        if(item.stream().anyMatch(i -> i.count < 0)) {

        //C，filter 過濾出符合條件的元素，而 findAny() 回傳一個 Optional 對象。此程式碼會編譯失敗，因為 Optional 不能直接當成布林條件，需要使用 .isPresent() 檢查。
        //if(item.stream().filter(i -> i.count < 0).findAny()) {

        //D，與選項 C 類似，findFirst() 回傳 Optional，需要檢查 .isPresent()，否則無法直接當作條件使用。
        //if(item.stream().filter(i -> i.count < 0).findFirst()) {
            System.out.println("There is an item for which the variable count is below zero.");
        } 
        else { //多加一行判斷式，如果沒有符合的話印出這一句
            System.out.println("All items have a count of zero or more.");
        }
    }
}
/*
You want to examine the items list if it contains an item for which the variable count is below zero.
Which code fragment at line 1 will accomplish this?
A. if(item.stream().allMatch(i -> i.count < 0)) {
B. if(item.stream().anyMatch(i -> i.count < 0)) {
C. if(item.stream().filter(i -> i.count < 0).findAny()) {
D. if(item.stream().filter(i -> i.count < 0).findFirst()) {
*/