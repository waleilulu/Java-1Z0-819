import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Optional;
//import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Comparator;

public class Q117 {
    private String name;
    private String neighborhood;
    private LocalDate birthday;
    private int salary;

    public String getNeighborhood() {
        return neighborhood;
    }

    public int getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        List<Q117> roster = new ArrayList<>();
        Map<String, Optional<Q117>> m = roster.stream()
        // Line 1
        //Which code fragment on line 1 makes the m map contain the employee with the highest salary for each neighborhood?
        //A

        
        //A
        .collect(Collectors.groupingBy(Q117::getNeighborhood, Collectors.maxBy(Comparator.comparingInt(Q117::getSalary))));
        
        //B
        //.collect(Collectors.maxBy(x, y) -> y.getSalary() - x.getSalary(), Collectors.groupingBy(Q117::getNeighborhood)));
        
        //C
        //.collect(Collectors.groupingBy(e->e.getNeighborhood(), Collectors.maxBy(x, y) -> y.getSalary()-x.getSalary()));

        //D
        //.collect(Collectors.maxBy(Q117::getSalary, Collectors.groupingBy(Comparator.comparing(e->e.getNeighborhood()))));
    }
}
