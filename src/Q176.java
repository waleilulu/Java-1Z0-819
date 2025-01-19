public class Q176 {
    int aCount;
    int tCount;
    int cCount;
    int gCount;

    void setACount(int cCount){
        cCount = cCount;
    } //這個方法的問題在於，它將參數 cCount 賦值給了自身，而不是給類別的欄位。這意味著 this.cCount 並未被修改，因此這個方法 不會改變欄位值。

    void setTCount(){
        this.tCount = tCount;
    } //this.tCount 會被賦值為 tCount，但 tCount 本身並未給出一個具體的數值。由於 tCount 變數沒有初始化，這樣的賦值操作會將 tCount 設置為其當前值（默認為 0）。這個方法 不會有效修改欄位值，因為它沒有傳入參數。
    
    int setCCount(){
        return cCount;
    } //這個方法只是返回 cCount 的值，並未修改 cCount。所以這個方法 不會改變欄位值。
    
    int setGCount(int g){
        gCount = g;
        return gCount;
    } //這個方法會將傳入的參數 g 賦值給 gCount，並返回 gCount。因此，這個方法 會修改 gCount 欄位的值。

    void setAllCounts(int x){
        aCount = tCount = this.cCount = setGCount(x);
    } //這個方法會調用 setGCount(x)，並將 gCount 設置為 x。同時，它會將 aCount、tCount 和 cCount 都設置為 gCount 的值（也就是 x）。因此，這個方法 會修改 aCount、tCount 和 cCount 欄位的值。
}


//C、D
/*
Which two methods modify field values? (Choose two.)
A. setTCount
B. setACount
C. setAllCounts
D. setGCount
E. setCCount
*/
