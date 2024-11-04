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
