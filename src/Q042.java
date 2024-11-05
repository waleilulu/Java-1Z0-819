// A. 合法的注解

@interface AuthorA {
    String name() default "";
    String date();
}

// B. 非法的注解（注释掉）
/*

@interface AuthorB extends Serializable {
    String name() default "";
    String date();
}
*/

// C. 合法的注解

// @interface AuthorC {
//     String name() default null; // 使用 null 作为默认值
//     String date();
// }

// D. 非法的注解（注释掉）
/*

@interface AuthorD {
    String name();
    String date; // 这不是一个方法
}
*/

// E. 非法的注解（注释掉）
/*

@interface AuthorE {
    String name();
    String date default ""; // 语法错误
}
*/

// 示例使用合法注解
@AuthorA(name = "Alice", date = "2024-11-04")
//@AuthorC(name = "Bob", date = "2024-11-05")
public class Q042 {
    public static void main(String[] args) {
        System.out.println("Example class with annotations.");
    }
}


/*
這段程式碼主要是在考察 Java 中的註解（Annotation）定義和使用，尤其是合法和非法註解的情況。讓我們逐一分析這段程式碼中的每個部分：
註解成員必須是方法，不能是普通字段。
註解的默認值 必須是常量表達式，不能使用 null 或其他非常量的值。
註解不能繼承接口或類，它只能繼承自 java.lang.annotation.Annotation。
註解中的成員 必須是方法，並且可以使用 default 關鍵字來指定默認值。
*/