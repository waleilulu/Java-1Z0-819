package Q111;

public class Hello {
    public static void main(String[] args) {
        Module module = Hello.class.getModule();
        System.out.println("Module: " + module);
        System.out.println("Name: " + module.getName());
        System.out.println("Description: " + module.getDescriptor());
        
    }
}

//指令使用以下，把class檔跟java檔放在一起
//javac src\Q111\Hello.java
//java -cp src Q111.Hello
/* 得出
Module: unnamed module @5ecddf8f
Name: null
Description: null
*/


//D
/*
Given the directory structure:
\Test
    Hello.java

Given the commands to execute at the Test directory prompt:
Test>javac -d Q111 Hello.java
Test>javac -cp Q111 Q111.Hello

Which statement is true?
A. Create an empty module-info.java file in the Test directory and on execution of the given commands, the program prints:
    Module: unnamed module @<</font><</font>hash code>>
    Name: null
    Descriptor: module-info

B. On execution of the given commands, the program prints:
    Module: Q111.Hello @<</font><</font>hash code>>
    Name: unnamed
    Descriptor: null

C. Execute java --module-path pac pac.Hello instead of java -cp pac pac.Hello and on execution the program prints:
    Module: Q111 @<</font><</font>hash code>>
    Name: Q111.Test
    Descriptor: null

D. On execution of the given commands, the program prints:
    Module: unnamed module @<</font><</font>hash code>>
    Name: null
    Descriptor: null
*/
