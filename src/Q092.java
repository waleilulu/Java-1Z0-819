import java.util.stream.IntStream;

public class Q092 {
    public static void main(String[] args) {
        var i = 1;
        var result = IntStream.generate(()->{return i;})
                                                    .limit(100).sum();
        System.out.println(result); //100
        

        System.out.println("A: " + IntStream.range(0, 99).count()); //99

        System.out.println("B: " +IntStream.rangeClosed(1, 100).count()); //100

        System.out.println("C: " +IntStream.range(1, 100).count()); //99

        System.out.print("D: " +IntStream.rangeClosed(0, 100).map(x -> x).count()); //101
    }
}

//B
/*
Which statement prints the same value of result? (Choose two.)
A. System.out.printIn(IntStream.range(0, 99).count());
B. System.out.printIn(IntStream.rangeClosed(1, 100).count());
C. System.out.printIn(IntStream.range(1, 100).count());
D. System.out.printIn(IntStream.rangeClosed(0, 100).map(x -> x).count());
*/