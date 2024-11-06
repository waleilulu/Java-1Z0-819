import java.io.FileNotFoundException;

public class Q049 {

    // ExSuper 類別
    public static class ExSuper extends Exception {
        private final int eCode;

        public ExSuper(int eCode, Throwable cause) {
            super(cause);
            this.eCode = eCode;
        }

        public ExSuper(int eCode, String msg, Throwable cause) {
            super(msg, cause);
            this.eCode = eCode;
        }

        @Override
        public String getMessage() {
            return this.eCode + ":" + super.getMessage() + "-" + this.getCause().getMessage();
        }
    }

    // ExSub 類別，繼承自 ExSuper
    public static class ExSub extends ExSuper {
        public ExSub(int eCode, String msg, Throwable cause) {
            super(eCode, msg, cause);
        }
    }

    public static void main(String[] args) {
        try {
            String paraml = "Oracle";
            if (paraml.equalsIgnoreCase("oracle")) { //不區分大小寫
                throw new ExSub(9001, "APPLICAION ERROR-9001", new FileNotFoundException("MyFile.txt"));
            }
            throw new ExSuper(9001, new FileNotFoundException("MyFile.txt")); // Line 1
        } catch (ExSuper ex) {
            System.out.println(ex.getMessage()); //9001:APPLICAION ERROR-9001-MyFile.txt
        }
    }
}

/*
What is the result?
A. 9001: java.io.FileNotFoundException: MyFile.txt-MyFile.txt
B. 9001: APPLICATION ERROR-9001-MyFile.txt
9001: java.io.FileNotFoundException: MyFile.txt-MyFile.txt
C. 9001: APPLICATION ERROR-9001-MyFile.txt
D. Compilations fails at Line 1.
*/