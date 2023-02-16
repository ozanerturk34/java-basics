package Game;

public class GuessTheWord {
    private boolean play = false;
    private Word randomWords = new Word();
    public void start() {
        do{
            showWord();
            getInput();
            checkInput();
        }while(play);
        System.out.println("Start");
    }

    void showWord(){
        System.out.println(randomWords);
    }
    void getInput(){
        System.out.println("getInput");
    }
    void checkInput(){
        System.out.println("checkInput");
    }
}
