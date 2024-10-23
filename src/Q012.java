import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Q012 {
    public static void main(String[] args) {
        var symbols = List.of("USD", "GBP", "EUR", "CNY");
        var exchangeRate = List.of(1.0, 1.3255, 1.1969, 0.1558094);

        // 創建一個對應的匯率反轉映射
        var map1 = IntStream.range(0, Math.min(symbols.size(), exchangeRate.size()))
                .boxed()
                .collect(Collectors.toMap(i -> symbols.get(i),
                        i -> 1.0 / exchangeRate.get(i)));
        

        // 按鍵排序並收集到 LinkedHashMap
        var map2 = map1.entrySet().stream()
            .sorted(Map.Entry.comparingByKey())
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, 
                    (oldValue, newValue)->oldValue, LinkedHashMap::new));
        
        // 輸出結果
        map2.forEach((var k, var v)->System.out.printf("%s->%.2f\n", k, v));
    }
}
