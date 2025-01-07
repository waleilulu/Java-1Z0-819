import java.util.Collection;
import java.util.Map;

public class Q098 {
    private Collection collection;
    public void set(Collection collection){
        this.collection = collection;
    }
}
class Y extends Q098 {
    public void set(Map<String, String>map){
        //super.set(map); // line 1
        //Which two lines can replace line 1 so that the Y class compiles? (Choose two.)
        //C、E

        //A
        //super.set(List map);

        //B
        //map.forEach((k, v) -> set(v)));

        //C
        set(map.values());

        //D
        //set(map)

        //E
        super.set(map.values());
    }
}

