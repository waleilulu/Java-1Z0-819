import java.util.List;

public class Q163 {
     List<Integer> numbers = List.of(2, 3, 0, 8, 1, 9, 5, 7, 6, 4);;
    //int sum = numbers.stream().reduce(0, (n, m) -> n+ m); // line 1
    //A
    //int sum = numbers.stream() .flatMap(a -> a).reduce (0, (n, m) -> n + m)

    //B
    //int sum = numbers.stream().iterate (0, a -> a+1).reduce (0, (n, m) -> n + m);

    //C
    //int sum = numbers.parallel().stream().reduce(0, (n, m) -> n + m);

    //D
    int sumD = numbers.parallelStream().reduce(0, (n, m) -> n + m); // 並行化歸約操作

    //E
    int sumE = numbers.stream().parallel().reduce(0, (n, m) -> n + m); // 並行化歸約操作

    public static void main(String[] args) {
        Q163 q163 = new Q163();
        System.out.println("SumD: " + q163.sumD);
        System.out.println("SumE: " + q163.sumE);
    }
}

//D、E

/*
You want to make the reduction operation parallelized.
Which two modifications will accomplish this?
A. Replace line 1 with int sum = numbers.stream() .flatMap(a -> a).reduce (0, (n, m) -> n + m);.
B. Replace line 1 with int sum = numbers.stream().iterate (0, a -> a+1).reduce (0, (n, m) -> n + m)
C. Replace line 1 with int sum = numbers.parallel ().stream().reduce(0, (n, m) -> n + m)
D. Replace line 1 with int sum = numbers.parallelStream().reduce (0, (n, m) -> n + m);.
E. Replace line 1 with int sum = numbers.stream().parallel().reduce(0, (n, m) -> n + m)
*/