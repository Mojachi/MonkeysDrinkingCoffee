
public class Main {

    public static void main(String[] args) {
        Monkey newMonkey = new Monkey("Ben", 100);
        System.out.println(newMonkey.name + " has joined the brigade!");
        newMonkey.getNewWord("animal");
        newMonkey.beginGuessing();
        newMonkey.getNewWord("farms");
        newMonkey.beginGuessing();
        newMonkey.getNewWord("are");
        newMonkey.beginGuessing();
        newMonkey.getNewWord("bad");
        newMonkey.beginGuessing();
    }
}
