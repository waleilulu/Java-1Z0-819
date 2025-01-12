import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class Q133 {
/*Given this declaration: 
@Target(TYPE)
@interface Resource {}
*/
    @Target(ElementType.TYPE)
    @interface Resource {}


    // 使用 @Resource 註解於介面宣告
    @Resource
    interface MyInterface {
        void myMethod();
    }

    // 使用 @Resource 註解於類別宣告
    @Resource
    // MyClass 實作 MyInterface 介面
    public class MyClass implements MyInterface {
        @Override
        public void myMethod() {
            System.out.println("MyClass implementation of myMethod");
        }
    }

    public static void main(String[] args) {
        MyClass myClass = new Q133().new MyClass();
        myClass.myMethod();
    }
}

//A、C
/*
For which two kinds of declarations can the @Resource annotation be applied? (Choose two.)
A. An interface declaration
B. A local variable declaration
C. A class declaration
D. A method declaration
E. A field declaration
*/