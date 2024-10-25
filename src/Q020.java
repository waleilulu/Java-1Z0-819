import java.sql.Timestamp;

public class Q020 {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Timestamp ts = new Timestamp(1);
    }
}

/*
command:
javac Q020.java 
jdeps -summary Q020.class
 */

// Q020.class -> java.sql
// java.sql -> java.base
