import java.util.List;

public class Q121 {
    public static void main(String[] args) {
        List<Player> players = List.of(new Player("Scott", 115), new Player("John", 70), new Player("Jelly", 105));
        double average = // line 1
                            //A
                            //players.stream().average().orElse(0.0);

                            //B
                            players.stream().mapToInt(a -> a.score).average().orElse(0.0);

                            //C
                            //players.stream().mapToDouble(a -> a.score).average().orElse(0.0);

                            //D
                            //players.stream().map(a -> a.score).average().orElse(0.0);

        System.out.println("The average is: " + average);
    }
    static class Player {
        public String name;
        public int score;
        public Player(String name, int score) {
            this.name = name;
            this.score = score;
        }
    }    
}
//B，使用 mapToInt() 方法將 Player 物件的 score 屬性映射為 int 值，然後調用 average() 方法計算平均值。
/*
You want to calculate the average of the Player’s score.
Which statement inserted on line 1 will accomplish this?
A. players.stream().average().orElse(0.0);
B. players.stream().mapToInt(a -> a.score).average().orElse(0.0);
C. players.stream().mapToDouble(a -> a.score).average();
D. players.stream().map(a -> a.score).average();
*/