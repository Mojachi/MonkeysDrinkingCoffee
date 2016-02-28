import java.util.Random;

public final class CharacterFactory {
    private final static String alphabet = "abcdefghijklmnopqrstuvwxyz";
    private final static Random rand = new Random();

    private CharacterFactory() {
        //Just don't allow constructer to be called. Emulating top-level static class.
    }

    public static char getRandomCharacter(){
        return alphabet.charAt(rand.nextInt(alphabet.length()));
    }

}
