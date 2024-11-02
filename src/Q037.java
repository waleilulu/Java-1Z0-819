public class Q037 {

    //y 是一個類的成員變數，可以在內部類中正常使用和修改。
    private static int y = 4; // 將 y 移動到類的成員變數



    public static int reduce(int x) {
        //int y = 4; //放在這裡會編譯不過，需要放在外面做成員變數
        class Computer {
            int reduce(int x) {
                return x - y--;
            }
        }
        Computer a = new Computer();
        return a.reduce(x);
    }

    public static void main(String[] args) {
        System.out.println(reduce(1));
    }
}

//D. The compilation fails.