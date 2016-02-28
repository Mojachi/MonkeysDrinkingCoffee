/**
 * Created by benjamindavidpinter on 2/27/16.
 */
public class Monkey implements Runnable{
    private String currentWord;
    String name = "";
    private CharacterFactory charFact;
    private boolean wordHasBeenFound = false;
    private int guesses = 0;
    private int wordsPerMinute = 0;
    private MonkeyTimer myTimer = new MonkeyTimer();

    public Monkey(String name, int wordsPerMinute){
        this.name = name;
        this.wordsPerMinute = wordsPerMinute;
    }

    public void run(){
        beginGuessing();
    }

    public void getNewWord(String newWord){
        this.currentWord = newWord.toLowerCase();
        System.out.printf("%n %s has been assigned the word '" + this.currentWord + "'", name);
        wordHasBeenFound = false;
    }

    public void beginGuessing(){
        String guessedWord = guessNewWord();
        while(!wordHasBeenFound){
            if(guessedWord.equalsIgnoreCase(currentWord)){
                wordHasBeenFound = true;
                System.out.printf("It took %s, %.2f Years, %.2f Days, %.2f Hours, and %.2f Minutes to find '%s'.%n", name
                        , myTimer.years, myTimer.days, myTimer.hours, myTimer.minutes, currentWord);
            }
            else {
                guessedWord = guessNewWord();
            }
            if (guesses % wordsPerMinute == 0){
                myTimer.addMinute();
                guesses = 0;
            }
        }

    }

    private String guessNewWord(){
        char[] guessedWord = new char[currentWord.length()];
        for(int i = 0; i < currentWord.length(); i++){
            guessedWord[i] = charFact.getRandomCharacter();
        }
        guesses++;
        return new String(guessedWord);
    }


}
