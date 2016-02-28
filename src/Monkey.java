/**
 * Created by benjamindavidpinter on 2/27/16.
 */
public class Monkey {
    private String currentWord;
    String name = "";
    private CharacterFactory charFact;
    private boolean isFound = false;
    private int guesses = 0;
    private int wordsPerMinute = 0;

    public Monkey(String name, int wordsPerMinute){
        this.name = name;
        this.wordsPerMinute = wordsPerMinute;
    }

    public void getNewWord(String newWord){
        this.currentWord = newWord.toLowerCase();
        System.out.println("I have been assigned the word '" + this.currentWord + "'");
        isFound = false;
    }

    public void beginGuessing(){
        System.out.println("Smacking some keys...");
        String guessedWord = getNewWord();
        while(!isFound){
            if(guessedWord.equalsIgnoreCase(currentWord)){
                isFound = true;
                System.out.println("Found '" + currentWord + "' after " + guesses + " guesses!");
                resolveTimeToFindWord();
            }
            else {
                guessedWord = getNewWord();
            }
        }

    }

    private String getNewWord(){
        char[] guessedWord = new char[currentWord.length()];
        for(int i = 0; i < currentWord.length(); i++){
            guessedWord[i] = charFact.getRandomCharacter();
        }
        guesses++;
        return new String(guessedWord);
    }

    private void resolveTimeToFindWord(){

        Double minutes = ((double)guesses / (double)wordsPerMinute);
        Double hours = minutes / 60;
        minutes = minutes % 60;
        Double days = hours / 24;
        hours = hours % 24;
        System.out.format("%.0f Days, %.0f hours, %.0f minutes spent.", days, hours, minutes);
    }
}
