import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Target;

public class Q016 {
    @Repeatable(Meals.class) // 註解是可重複的。這意味著你可以在同一個類別上多次使用 @Meal 註解
    //Meals.class 是用來定義這些可重複註解的容器註解。在運行時，如果一個類別上有多個 @Meal 註解，這些註解將會被封裝到一個 @Meals 的實例中

    @Target(ElementType.TYPE) //註解定義了 @Meal 註解可以應用的範圍
    //ElementType.TYPE 表示 @Meal 可以被應用於類別、接口、列舉或註解類型上

    public @interface Meal { //定義了一個名為 Meal 的註解類別
        String starter() default ""; //如果沒有指定前菜，則默認為空字串 ("")。這是可選的參數，使用者可以選擇不提供這個值
        String mainCourse(); //必填的屬性，必須提供主菜的名稱
        String dessert() default "";
    }

    @Target(ElementType.TYPE)
    public @interface Meals {
        Meal[] value(); //Meal[] 表示這是一個 Meal 陣列，可以容納多個 @Meal 註解的實例。當你在一個類別上使用多個 @Meal 註解時，這些註解會被自動收集到這個 value 屬性中
    }

    //A. 
    /*
    @Meal(mainCourse="pizza") //第一個點餐，有點主菜(這是必填項目)，編譯會過
    @Meal(dessert="pudding") //第二個點餐，沒有點主菜，編譯就不會過
    public class Main {
    }
    */

    //B.
    /*
    @Meal(mainCourse=null) //主餐為必點項目，不可以給空值
    public class Main {
    }
    */
    

    //C.
    /*
    @Meal(starter=”snack”, dessert=”ice cream”) //沒有點主餐
    public class Main {
    }
    */
    

    // D.
    /*
    @Meal(mainCourse="pizza") //第一個點餐，有點主菜(這是必填項目)，編譯會過
    @Meal(mainCourse="salad") //第二個點餐，有點主菜(這是必填項目)，編譯會過
    public class Main {
    }
    */
    

    // E.
    
    @Meal(mainCourse="pizza", starter="snack", dessert="pudding") //有點主菜(這是必填項目)，編譯會過
    public class Main {
    }
    
}
