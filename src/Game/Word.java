package Game;

public class Word {

    private String[] randomWords = {"animals","asdasd","friend","gaga","gigi","happy","blazer","mama","serendipity","elegance",
    "wallet","school","computer","cloud","cat","dog","stupid","mark","mike","enormous"};

    private String selectedWord;

    public Word() {
        double random = Math.random();
        int index = (int) Math.round(random*(randomWords.length-1));
        selectedWord =  randomWords[index];
    };

    @Override
    public String toString() {
        return selectedWord;
    }
}
