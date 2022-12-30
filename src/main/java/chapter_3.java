public class chapter_3 {
    public static void main(String[] args) {
     Book2 book2 = new Book2("俺のブッカーズだ！");
     book2.open();
     book2.look();

    }
}

class Book {
    public String mybook;

    public Book(String item) {  //コンストラクタの引数に文字列と名前を与える
        mybook = item;  //コンストラクタの引数を代入する
    }
    public void open() {
        System.out.println(mybook + "を作った");
    }
}

class Book2 extends Book {
    public Book2(String item) {
        super(item);  //superとして引数を与える　その際、子クラスのコンストラクタの引数と同じ引数を与える必要がある
    }
    public void look() {
        System.out.println("ブッカーズ２に改良した");
    }
}