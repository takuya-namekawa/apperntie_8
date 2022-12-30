public class chapter_5 {
    public static void main(String[] args) {
        System.out.println("== パーティーでスライムと戦かう　＝＝");

        Player hero = new Player("戦士");
        Player warrior = new Player("重戦士");
        Wizard wizard = new Wizard("魔剣士");
        Player[] party = {hero, warrior, wizard};

        for (Player member : party) {
            member.attack("スライム");
        }
        //hero.attack("スライム");
    }
}

class Player {
    public String myName;

    public Player(String name) {
        myName = name;
    }

    public void attack(String enemy) {
        System.out.println(myName + "は、" + enemy + "を攻撃した！");
    }
}

class Wizard  extends Player {
    public Wizard(String name) {
        super(name);
    }

    public void attack(String enemy) {
        System.out.println("ンンンンンドオウウウフ");
        System.out.println(myName + "は、" + enemy + "に炎を放った！！");
    }
}