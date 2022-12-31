public class chapter_7 {
    public static void main(String[] args) {
        //メソッドのｵｰﾊﾞｰﾛｰﾄﾞ
        attack1();
        attack1("スタイム");
        attack1(5);
        attack1("もんすたー",89 );


    }
    public static void attack1() {
        System.out.println("勇者は敵を攻撃した");
    }

    public static void attack1(String target) {
        System.out.println("勇者は" + target + "を攻撃した");
    }
    public static void attack1(int number) {
        System.out.println("勇者は" + number + "匹の敵を攻撃した");
    }


    public static void attack1(String target, int number) {
        System.out.println("勇者は" + number + "匹の" + target + "を攻撃した");
    }
}
