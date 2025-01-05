import java.util.ArrayList;
import java.util.Arrays;

public class Q087 {
    public static void main(String[] args) {
        String[] catNames = {"abyssinian", "oxicat", "korat", "laperm", "bengal", "sphynx"};
        var cats = new ArrayList<>(Arrays.asList(catNames));
        cats.sort((var a, var b) -> -a.compareTo(b)); //-a.compareTo(b) 的作用是反轉比較結果，使得排序結果為 降冪排序（即從 Z 到 A）。
        cats.forEach(System.out::println);
    }
}

/* C
sphynx
oxicat
laperm
korat
bengal
abyssinian
*/

/*
What is the result?
A. abyssinian
oxicat
korat
laperm
bengal
sphynx
B. abyssinian
bengal
korat
laperm
oxicat
sphynx
C. sphynx
oxicat
laperm
korat
bengal
abyssinian
D. nothing
*/
