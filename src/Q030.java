import java.util.List;
import java.util.ArrayList;

class Member {
    private String name;
    private int yearsMembership;

    public Member(String name, int yearsMembership) {
        this.name = name;
        this.yearsMembership = yearsMembership;
    }

    public int getYearsMembership() {
        return yearsMembership;
    }

    public String getName() {
        return name; // 添加這個方法來獲取名字
    }

    public void print() {
        System.out.println(name + ": " + yearsMembership + " years");
    }
}

public class Q030 {
    String testName = "smith";
    int testMembershipLength = 5;

    public static void main(String[] args) {
        Q030 q030 = new Q030();
        q030.run();
    }

    public void run() {
        List<Member> clubMembers = new ArrayList<>();
        clubMembers.add(new Member("smith", 5));
        clubMembers.add(new Member("john", 3));
        clubMembers.add(new Member("amy", 7));

        long matches = clubMembers.stream()
            .peek(Member::print) // 使用方法引用 D
            .filter(m -> m.getYearsMembership() >= testMembershipLength) // 保留過濾條件，過濾符合年限條件的會員，結果是 smith 和 amy
            .map(Member::getName) // 使用方法引用獲取名字，提取符合條件會員的名字，結果是 ["smith", "amy"]
            .map(testName::compareToIgnoreCase) // 使用方法引用 B，比較名字。如果 name 是 smith，則結果是 0；如果是 amy，則結果不是 0
            .filter(a -> a == 0) //這步會保留 0，也就是只有 smith 的名字會通過這個過濾
            .count(); //這會計算符合所有條件的會員數量，結果是 1（只有 smith）

        System.out.println(matches); //符合的只有smith
    }
}



/*
 * Which two Stream methods can be changed to use method references? (Choose
 * two.)
 * A. .filter(Integer::equals(0))
 * B. .map(testName::compareToIgnoreCase)
 * C. .filter(Member::getYearsMembership() >= testMembershipLength)
 * D. .peek(Member::print)
 */