interface Converter {
    // 常數定義
    public static final double POUNDS_PER_KILOGRAM = 2.20462; // Line 1

    // 抽象方法
    public double tare();
    public double net();

    // 預設方法
    public default double gross(){ // Line 2
        return tare() + net(); //計算毛重，預設實現是將皮重和淨重相加。
    }

    // 重載的預設方法，這些方法是 tare(), net() 和 gross() 的重載版本，接受一個單位參數 units，並將結果轉換為指定的單位。
    public default double tare(String units){
        return toUnit(tare(), units);
    }
    public default double net(String units){
        return toUnit(net(), units);
    }
    public default double gross(String units){
        return toUnit(gross(), units);
    }

    // 私有靜態方法，定義了一個私有靜態方法 toUnit()，用來將公斤轉換為指定的單位（公斤或磅）。如果單位不是 "KILO" 或 "POUND"，則拋出 IllegalArgumentException。
    private static double toUnit(double kilograms, String units){ // Line 3
        switch(units){
            case "KILO": return kilograms;
            case "POUND": return kilograms * POUNDS_PER_KILOGRAM;
            default: throw new IllegalArgumentException();
        }
    }
    
}

// 這是一個實現 Converter 介面的類別，實現了 tare()、net() 和 gross() 方法。
public class Q161 implements Converter {
    // 實作抽象方法
    @Override
    public double tare() {
        return 2.0; // 假設皮重是2公斤
    }

    @Override
    public double net() {
        return 10.0; // 假設淨重是10公斤
    }

    @Override
    public double gross() {
        return 12.0; // 假設毛重是12公斤
    }

    public static void main(String[] args) {
        Q161 q161 = new Q161();
        System.out.println("Net in KILO: " + q161.net("KILO"));
        System.out.println("Net in POUND: " + q161.net("POUND"));
        System.out.println("Gross in KILO: " + q161.gross("KILO"));
        System.out.println("Gross in POUND: " + q161.gross("POUND"));
    }
}


//C
/*
Which is true?
A. Line 2 is the first line to cause a compilation error.
B. Line 3 is the first line to cause a compilation error.
C. It compiles without errors.
D. Line 1 is the first line to cause a compilation error.
*/