import java.lang.annotation.ElementType;  // 匯入 ElementType
import java.lang.annotation.Target;       // 匯入 Target

public class Q057 {
    @JsonField(type = JsonField.Type.STRING, name="name")
    private String _name;

    @JsonField(type = JsonField.Type.INT, name = "")
    private int x;

    @JsonField(type = JsonField.Type.INT, name = "")
    private int y;
}
//C
/*
@interface JsonField {

    String name();
    enum Type{
        INT, STRING, BOOLEAN
    };
    Type type();
}
*/
//在這段程式碼中，JsonField 註解的 name 屬性是必填的（沒有設預設值），因此 @JsonField(type = JsonField.Type.INT, name = "") 中的 name = "" 會出現編譯錯誤。Java 中的註解屬性值不能為空字串（除非註解定義了預設值）。所以這段程式碼無法編譯。

//D
//在這段程式碼中，JsonField 註解定義了 name 屬性具有預設值 default ""，因此 name = "" 是合法的，這段程式碼可以成功編譯。
@Target(ElementType.FIELD)
@interface JsonField{
    String name() default ""; //讓屬性成為選填：如果你不提供屬性的值，編譯器就會使用你在註解中指定的預設值，這樣可以避免每次使用註解時都必須提供所有屬性的值。
    enum Type{
        INT, STRING, BOOLEAN
    };
    Type type();
}
