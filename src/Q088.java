public class Q088{
    private final double value;
    public Q088(String value) {
    this(Double.parseDouble(value));
    }
    public Q088(double value) {
    this.value = value;
    }
    public Q088() {
        // 無參構造方法，value 默認為 0.0（由於 'final'，必須賦值）
        //this.value = 0.0;
    }
    public double getValue() { return value; }
    public static void main(String[] args) {
        Q088 p1 = new Q088("1.99");
        Q088 p2 = new Q088("2.99");
        Q088 p3 = new Q088();
        System.out.println(p1.getValue() + "," + p2. getValue() + ", " + p3.getValue());
    }
    }

/*C

無參數構造方法因為上面的final需賦值
public Q088() {
        // 無參數構造方法，value 默認為 0.0（由於 'final'，必須賦值）
        this.value = 0.0;
    }
*/

/*
What is the result?
A. 1.99,2.99,0
B. 1.99,2.99,0.0
C. The compilation fails.
D. 1.99,2.99
*/