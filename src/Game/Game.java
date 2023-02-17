package Game;

public class Game {
    private static Game obj;
    private Game() {}

    public static Game getGame() {
        if(obj==null) {
            obj = new Game();
        }
        return obj;
    }

    public  void start() {
        GuessTheWord game = new GuessTheWord();
        game.start();
        game.end();
    }
}
