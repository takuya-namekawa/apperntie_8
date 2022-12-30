import org.w3c.dom.ls.LSOutput;

public class chapter_4 {
    public static void main(String[] args) {
        Pen pen1 = new Pen("赤いペン");
        pen1.red();

        Ink ink = new Ink("真っ赤っかなペン");
        ink.red();
        ink.look();
    }
}

class Pen {
    public String myPen;

    public Pen(String pen) {
        myPen = pen;
    }
    public void red() {
        System.out.println(myPen + "の色は赤色です");
    }
}

class Ink extends Pen {
    public Ink(String myPen) {
        super(myPen);
    }

    public void look() {
        System.out.println("ペンの中のインクが赤いから赤いペンなんだね");
    }
    public void red() {//オーバーライドさせるには、親クラスと同じメソッドを活用すると書きかえる事が出来る
        System.out.println("突然、インクがしゃべりだしました！");
    }
}