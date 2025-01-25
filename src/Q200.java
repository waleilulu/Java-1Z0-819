public class Q200 {
    public static void main(String[] args) {
        int x = 0;
        while (x < 10) {
            System.out.print(x++); // 0123456789
        }

        System.out.println("\n"); // 做間隔

        //B
        //Which "for" loop produces the same output?
        
        //A，編譯錯誤
        // for(a; a<10; a++){
        //     System.out.print(a++);
        // }
            //需在 for 迴圈外或內宣告並初始化 a
            //方法一
            // int a=0;
            // for(; a<10; a++){
            // System.out.print(a++);
            
            //方法二
            // for(int a=0; a<10; a++){
            //     System.out.print(a++);
            // }

        //B
        for(int d=0;d<10;){
            System.out.print(d); // 0123456789
            d++;
        }

        //C
        // for(int c=0; ;c++){
        //     System.out.print(c); // 012345678910
        //     if(c==10){
        //         break;
        //     }
        // }

        //D
        // int b=0;
        // for(;b<10;){
        //     System.out.print(++b); // 12345678910
        // }
    }
}

