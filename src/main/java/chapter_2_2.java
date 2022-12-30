public class chapter_2_2 {
    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.sayHello();
    }
}

class Greeting {
    public String msg;
    public String target;

    public Greeting() {
        msg = "hello";
        target = "world";
    }
}

class Hello extends Greeting {
    public void sayHello() {
        System.out.println(msg + " " + target);
    }
}
