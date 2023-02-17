package Game;

import java.util.Scanner;

public class GuessTheWord {
    private boolean play = true;
    private Word randomWords = new Word();
    private Scanner scanner = new Scanner(System.in);
    private int rounds = 10;
    public void start() {
        do{
            showWord();
            char letter = getInput();
            checkInput(letter);
            if(randomWords.wordGuessed()){
                showWord();
                System.out.println("Nice!");
                System.out.println("Game over!");
                play = false;
            } else {
                System.out.println("Remaining number of tries: " + rounds);
                if(rounds == 0) {
                    System.out.println("You lost you pensy");
                    play = false;
                }
            }

        }while(play);
    }
    public void end() {
        scanner.close();
    }
    private void showWord(){
        System.out.println(randomWords);
    }
    private char getInput(){
        System.out.println("Guess a letter: ");
        String userGuess = scanner.nextLine();
        if(userGuess == null || userGuess.length() == 0) {
            System.out.println("Can't be empty. Enter a letter: ");
            return getInput();
        }
        return userGuess.charAt(0);
    }
    private void checkInput(char letter){
        boolean guessedRight = randomWords.guess(letter);
        if(!guessedRight) {
            rounds -= 1;
        }
    }
}
