package Q003;

//import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Bar extends Foo{ //當子類別（Bar）試圖覆寫父類別（Foo）的方法時，子類別的方法必須具有相同的名稱、返回類型和參數類型
    //public List<Number> foo(Set<String> m) {return null;} //父類別 Foo 中，foo 方法的返回類型是 List<Integer>，且父類別的 foo 方法接受的參數是 Set<CharSequence>
    public List<Integer> foo(Set<CharSequence> m) {return null;} //與父類別一致
    public List<Integer> foo(TreeSet<String> m) {return null;} //foo 方法的返回類型一致，重載參數類型
    //public List<Object> foo(Set<CharSequence> m) {return null;} //參數 Set<CharSequence> 是正確的，但在子類別中定義的 foo 方法返回 List<Object>。這兩個返回類型不一致，這使得這個方法無法覆寫父類別的方法。
    //public ArrayList<Integer> foo(Set<String> m) {return null;} //參數類型必須完全相同，返回類型必須與父類別的方法完全一致
    //public ArrayList<Number> foo(Set<CharSequence> m) {return null;} //返回類型必須與父類別的方法完全一致

}
