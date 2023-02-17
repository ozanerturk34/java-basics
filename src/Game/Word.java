package Game;

import java.util.Random;

public class Word {

    private String[] randomWords = {"animals","asdasd","friend","gaga","gigi","happy","blazer","mama","serendipity","elegance",
    "wallet","school","computer","cloud","cat","dog","stupid","mark","mike","enormous"};

    private String selectedWord;

    // Basically Math.random() with integer instead of double
    private Random random = new Random();

    private char[] letters;

    public Word() {
        selectedWord =  randomWords[random.nextInt(randomWords.length)];
        letters = new char[selectedWord.length()];
    };

    @Override
    public String toString() {
        StringBuilder word = new StringBuilder();
        for(char letter : letters) {
            word.append(letter == '\u0000' ? '-' : letter);
        }
        return word.toString();
    }
    boolean guess(char guessedLetter) {
        boolean guessedRight = false;
        char[] charArray = selectedWord.toCharArray();
        for(int i = 0; i < charArray.length; i++ ) {
            if(charArray[i] == guessedLetter) {
                letters[i] = guessedLetter;
                guessedRight = true;
            }
        }
        return guessedRight;
    }

    public boolean wordGuessed() {
        for(char letter : letters) {
            if(letter  == '\u0000') {
                return false;
            }
        }
        return true;
    }
}
