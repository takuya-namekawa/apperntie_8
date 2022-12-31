import java.util.*;

public class chapter_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      //  String player1 = sc.next();
      //  System.out.println(player1 + "は、荒野を歩いていた");
        ArrayList<String> team = new ArrayList<String>();
        while (sc.hasNextLine()) {//hasNextLineを使うと複数の要素を標準入力で入力する事が出来る　ただ終わりの条件がないためムゲンループしてる
            String player1 = sc.next();
            System.out.println(player1 + "は、荒野を歩いていた");
            team.add(player1);
        }
        for (String member : team) {
            System.out.println(member + "は、モンスターと戦った");
        }
    }
}
