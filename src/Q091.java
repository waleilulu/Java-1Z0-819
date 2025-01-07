{  
    Iterator loop = List.of(1, 2 ,3).iterator();
    while (loop.hasNext()) {
        foo(loop.next());
    }
    Iterator loop2 = List.of(1, 2 ,3).iterator();
    while (loop.hasNext()) {
         bar(loop2.next());
    }
}
    for(Iterator loop2 = List.of(1, 2 ,3).iterator(); loop.hasNext();){
        bar(loop2.next());
    }
    for(Iterator loop = List.of(1, 2 ,3).iterator(); loop.hasNext();){
        foo(loop.next());
    }


//A，第 11 行的 for 迴圈因為使用未定義的變數 loop，會產生編譯錯誤。    
/*
Which loop incurs a compile time error?
A. the loop starting line 11
B. the loop starting line 7
C. the loop starting line 14
D. the loop starting line 3
*/    


public class Q091 {
        
}