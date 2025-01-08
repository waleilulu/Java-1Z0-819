public class Q107 {
    static StringBuilder s = new StringBuilder("ABCD");
        public static void main(String[] args) {
            //Which would cause s to be AQCD?
            //C

            //A
            //s.replace(s.indexOf("B"), s.indexOf("B"), "Q"); //AQBCD

            //B
            //s.replace(s.indexOf("A"), s.indexOf("B"), "Q"); //QBCD

            //C
            s.replace(s.indexOf("B"), s.indexOf("C"), "Q"); //AQCD

            //D
            //s.replace(s.indexOf("A"), s.indexOf("C"), "Q"); //QCD

            System.out.println(s);
    }
}
