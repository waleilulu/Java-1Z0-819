import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Q086 {
    private String name;
    private String neighborhood;
    private int salary;

    // 無參構造方法
    public Q086() {
        this.name = "Unknown";
        this.neighborhood = "Unknown";
        this.salary = 0;
    }

    // 帶參構造方法
    public Q086(String name, String neighborhood, int salary) {
        this.name = name;
        this.neighborhood = neighborhood;
        this.salary = salary;
    }

    // 部分帶參構造方法：僅設置 name 和 neighborhood
    public Q086(String name, String neighborhood) {
        this.name = name;
        this.neighborhood = neighborhood;
        this.salary = 0;  // 預設薪水為 0
    }

    // 部分帶參構造方法：僅設置 name
    public Q086(String name) {
        this.name = name;
        this.neighborhood = "Unknown";  // 默認居住地
        this.salary = 0;  // 默認薪水
    }

    // Getter 和 Setter 方法（可選）
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        List<Q086> roster = new ArrayList<>();
        roster.add(new Q086("Alice", "Downtown", 35));
        roster.add(new Q086("Bob", "Uptown", 40));
        roster.add(new Q086("Charlie", "Downtown", 25));
        roster.add(new Q086("David", "Uptown", 50));
        roster.add(new Q086("Eve", "Midtown", 20));
        Predicate<Q086> p = e -> e.getSalary() > 30;
        Function<Q086, Optional<String>> f = e -> Optional.ofNullable(e.getNeighborhood());

        Map<Optional<String>, List<Q086>> r4 = roster.stream()
                                                    .collect(Collectors.groupingBy(f, Collectors.filtering(p, Collectors.toList())));
            System.out.println("Option A:");
            r4.forEach((key, value) -> {
                System.out.println("Neighborhood: " + key.orElse("Unknown") + ", salary > 30: " + value.size());
            });
        /*    
        Map<Optional<String>, List<Q086>> r3 = roster.stream()
                                                    .filter(p)
                                                    .collect(Collectors.groupingBy(p));
        */    

        Map<String, List<Q086>> r1 = roster.stream()
                                                    .collect(Collectors.groupingBy(Q086::getNeighborhood, Collectors.filtering(p, Collectors.toList())));
                                                    System.out.println("Option C:");
                                                    r1.forEach((key, value) -> {
                                                        System.out.println("Neighborhood: " + key + ", salary > 30: " + value.size());
                                                    });    
        /*    
        Map<String, List<Q086>> r2 = roster.stream()
                                                    .filter(p)
                                                    .collect(Collectors.groupingBy(f, Q086::getNeighborhood));

        Map<Optional<String>, List<Q086>> r5 = roster.stream()            
                                                    .collect(Collectors.groupingBy(Q086::getNeighborhood, Collectors.filtering(p, Collectors.toList())));));                            
        */    
    }
    
}



//A、C
/*
Which two Map objects group all employees with a salary greater than 30 by neighborhood?
A. Map<Optional<String>, List<Q086>> r4 = roster.stream()
                                                    .collect(Collectors.groupingBy(f, Collectors.filtering(p, Collectors.toList())));
B. Map<Optional<String>, List<Q086>> r3 = roster.stream()
                                                    .filter(p)
                                                    .collect(Collectors.groupingBy(p));
C.  Map<String, List<Q086>> r1 = roster.stream()
                                                    .collect(Collectors.groupingBy(Q086::getNeighborhood, Collectors.filtering(p, Collectors.toList())));
D.  Map<String, List<Q086>> r2 = roster.stream()
                                                    .filter(p)
                                                    .collect(Collectors.groupingBy(f, Q086::getNeighborhood));
E.  Map<Optional<String>, List<Q086>> r5 = roster.stream()            
                                                    .collect(Collectors.groupingBy(Q086::getNeighborhood, Collectors.filtering(p, Collectors.toList())));));                                                                                                       
*/