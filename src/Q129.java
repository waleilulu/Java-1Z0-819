import java.time.LocalDate;
import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Q129 {
    private String name;
    private LocalDate birthday;
    private int salary;

    public Q129(String name, int salary, LocalDate birthday) {
        this.name = name;
        this.salary = salary;
        this.birthday = birthday;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public LocalDate getBirthday() {
        return birthday;
    }
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    public static void main(String[] args) {
        List<Q129> roster = new ArrayList<>();    

        roster.add(new Q129("Alice", 30, IsoChronology.INSTANCE.date(1990, 1, 1)));
        roster.add(new Q129("Bob", 20, IsoChronology.INSTANCE.date(1985, 1, 1)));
        roster.add(new Q129("Charlie", 40, IsoChronology.INSTANCE.date(1992, 1, 1)));
        
        Predicate<Q129> p = e -> e.getSalary() > 25;
        LocalDate d = IsoChronology.INSTANCE.date(1989, 1, 1);
        long youngAndRich = roster.stream()
                              // Line 1
                              //A
                              //.filter(p && e.getBirthday().isAfter(d))
                              //.count();

                              //B
                              //這個選項是正確的。它首先使用 filter(p) 過濾薪水大於 25 的員工，然後使用 filter(e -> e.getBirthday().isAfter(d)) 過濾生日在 1989 年 1 月 1 日之後的員工，最後使用 count() 計算符合條件的員工數量。
                                .filter(p)
                                .filter(e -> e.getBirthday().isAfter(d))
                                .count();

                              //C
                                // .collect(Collectors.partitioningBy(p);
                                // .get(true)
                                // .stream()
                                // .collect(Collectors.partitioningBy(e -> e.getBirthday().isAfter(d)))
                                // .get(true)
                                // .count();
                                // )

                              //D
                                // .collect(Collectors.partitioningBy(e ->e.getBirthday().isAfter(d));
                                // .get(true)
                                // .count();)
                              

        System.out.println("Number of young and rich employees: " + youngAndRich);                             
    }
}


//B
/*
Which code fragment, when inserted on line 1, gives the number of employees who were born after January 1, 1989 and have a salary greater than
25?


//A
.filter(p && e.getBirthday().isAfter(d))
.count();

//B
.filter(p)
.filter(e -> e.getBirthday().isAfter(d))
.count();

//C
.collect(Collectors.partitioningBy(p);
                              .get(true)
                              .stream()
                              .collect(Collectors.partitioningBy(e -> e.getBirthday().isAfter(d)))
                              .get(true)
                              .count();
                              )

//D
.collect(Collectors.partitioningBy(e ->e.getBirthday().isAfter(d));
                              .get(true)
                              .count();

*/