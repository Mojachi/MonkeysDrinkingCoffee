
public class Main {

    public static void main(String[] args) {
        Monkey m1 = new Monkey("Ben", 100);
        Monkey m2 = new Monkey("Chris", 100);
        Monkey m3 = new Monkey("Ashley", 100);
        Monkey m4 = new Monkey("Steve", 100);

        m1.getNewWord("tractor");
        m2.getNewWord("dog");
        m3.getNewWord("barks");
        m4.getNewWord("loudly");

        System.out.printf("%n%n");

        Thread thread = new Thread(m1);
        Thread thread2 = new Thread(m2);
        Thread thread3 = new Thread(m3);
        Thread thread4 = new Thread(m4);

        thread.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
