import java.nio.file.Path;
import java.nio.file.Paths;

public class Q031 {
    public static void main(String[] args) {
        Path p1 = Paths.get("/scratch/exam/topsecret/answers");
        Path p2 = Paths.get("/scratch/exam/answers/temp.txt");
        Path p3 = Paths.get("/scratch/answers/topsecret");

         // 打印所有選項的相對路徑
         System.out.print("A: ");
         System.out.println(p3.relativize(p1));
         
         System.out.print("B: ");
         System.out.println(p2.relativize(p3)); //..\..\..\answers\topsecret
         
         System.out.print("C: ");
         System.out.println(p1.relativize(p3)); //..\..\..\answers\topsecret
         
         System.out.print("D: ");
         System.out.println(p3.relativize(p2));
         
         System.out.print("E: ");
         System.out.println(p1.relativize(p2));
         
         System.out.print("F: ");
         System.out.println(p2.relativize(p1));
    }
}
/*
Given:
Path p1 = Paths.get(“/scratch/exam/topsecret/answers”);
Path p2 = Paths.get(“/scratch/exam/answers/temp.txt”);
Path p3 = Paths.get(“/scratch/answers/topsecret”);

Which two statements print ..\..\..\answers\topsecret? (Choose two.)
A. System.out.print(p3.relativize(p1));
B. System.out.print(p2.relativize(p3));
C. System.out.print(p1.relativize(p3));
D. System.out.print(p3.relativize(p2));
E. System.out.print(p1.relativize(p2));
F. System.out.print(p2.relativize(p1));
*/