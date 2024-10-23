public class Q004 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(5);
        sb.append("HOWDY"); //HOWDY=>長度五
        
        sb.insert(0, ' '); // HOWDY，前面插了一個空格=>長度變六
        System.out.println(sb); //可以印出來試試看，就知道答案了

        sb.replace(3, 5, "LL"); // HOLLY，更換序號3、4為LL
        System.out.println(sb);
        
        sb.insert(6, "COW"); // HOLLYCOW
        System.out.println(sb);
        
        sb.delete(2, 7); // HOW
        System.out.println(sb);
        
        System.out.println(sb.length()); //HOW前面還有個空格，所以長度是4
    }
}
