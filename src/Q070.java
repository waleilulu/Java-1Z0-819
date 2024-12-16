public class Q070 {
    /*--自己補上-- */
     // 定義A類別
     public class A {
        String value;

        // A類別的建構子
        public A(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    // 定義B類別，繼承A
    public class B extends A {

        // B類別的建構子
        public B(String value) {
            super(value);  // 呼叫A的建構子
        }

        @Override
        public String getValue() {
            return "B: " + value;  // 覆寫A的getValue方法
        }
    }
    /*--自己補上-- */


    // 定義Builder介面
    public interface Builder {
        public A build(String str);        
    }

    public class BuilderImpl implements Builder {
        @Override
        public B build(String str){
            return new B(str);
        }
    }
}

//BCE
/*
Assuming that this code compiles correctly, which three statements are true? (Choose three.)
A. A cannot be abstract.
B. A cannot be final.
C. B cannot be abstract.
D. B cannot be final.
E. B is a subtype of A.
F. A is a subtype of B.
*/