import java.io.Console;

public class Q189 {
    public static void main(String[] args) {
        Console console = System.console();
        var name = console.readLine("Input name: ");
        var password = console.readPassword("Input Password: ");
        System.out.println("Name is: " + name + ", Password is: " + String.valueOf(password));
        /*
        Input name: Duke
        Input Password: 
        Name is: Duke, Password is: Java
        */
    }
}

//A
/*
and the command:
java ConsoleTest
The user will input Duke and Java when the input is prompted.


What is the output?
A. Input Name: Duke -
Input Password:
Name is: Duke, Password is: Java

B. Input Name: Duke -
Input Password: Java -
Name is: Duke, Password is: Java

C. Input Name: Duke -
Input Password:
Name is: Duke, Password is:

D. Input Name: Duke -
Input Password: Java -
Name is: Duke, Password is: [C@4f6ee6e4
*/