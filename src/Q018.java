public class Q018 {
    int aCount;
    int tCount;
    int cCount;
    int gCount;

    Q018(int a, int tCount, int c, int g){
    //Which two lines of code when inserted in line 1 correctly modifies instance variables? (Choose two.)
        //設置實例變數
        //A. 
        cCount = setCCount(c);
        
        //B. 
        //setCCount(c) = cCount;
        
        //C. 
        setGCount(g);
        
        //D. 
        //tCount = tCount; //t沒有設置實例變數，所以tCount 變數會保持其默認值 0
        //如果要印出來的話，就要改成以下
        //this.tCount = tCount;

        //E. 
        aCount = a;
    }


    int setCCount(int c){
        return c;
    }
    void setGCount(int gCount){
        this.gCount = gCount;
    }

    // 方法用於打印實例變數
    void printCounts() {
        System.out.println("aCount: " + aCount);
        System.out.println("tCount: " + tCount);
        System.out.println("cCount: " + cCount);
        System.out.println("gCount: " + gCount);
    }

    public static void main(String[] args) {
        Q018 obj = new Q018(10, 20, 30, 40); // 創建實例
        obj.printCounts(); // 調用打印方法
    }
}
