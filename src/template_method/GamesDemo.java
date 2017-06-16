package template_method;

/**
 * Template Method pattern is when you encapsulate the outline of an algorithm or lifecycle in an abstract class,
 * but define certain specific steps as abstract methods. This class then forms a “template” that others can subclass,
 * only supplying the details that are different.
 *
 * We can have more template methods in public API.
 *
 * An abstract class that is common to several games in which players play against the others, but only one is
 * playing at a given time.
 */
abstract class Game {

    protected int playersCount;

    // Hook methods. Concrete implementation may differ in each subclass
    protected abstract void initializeGame();

    protected abstract void makePlay(int player);

    protected abstract boolean endOfGame();

    protected abstract void showWinner();

    // A template method. Should be final.
    public final void playOnce(int playersCount) {
        this.playersCount = playersCount;
        initializeGame();
        int j = 0;
        while (!endOfGame()) {
            makePlay(j);
            j = (j + 1) % playersCount;
        }
        showWinner();
    }

    /* We can have more template methods in public API. */

    // ...
}

class Monopoly extends Game {

    @Override
    protected void initializeGame() {
        // Initialize players
        // Initialize money
        System.out.println("The method or operation is not implemented.");
    }

    @Override
    protected void makePlay(int player) {
        // Process one turn of player
        System.out.println("The method or operation is not implemented.");
    }

    @Override
    protected boolean endOfGame() {
        // Return true if game is over according to Monopoly rules
        System.out.println("The method or operation is not implemented.");
        return true;
    }

    @Override
    protected void showWinner() {
        // Display who won
        System.out.println("The method or operation is not implemented.");
    }

    /* Specific declarations for the Monopoly game. */

    // ...
}

class Chess extends Game {

    @Override
    protected void initializeGame() {
        // Initialize players
        // Put the pieces on the board
        System.out.println("The method or operation is not implemented.");
    }

    @Override
    protected void makePlay(int player) {
        // Process a turn for the player
        System.out.println("The method or operation is not implemented.");
    }

    @Override
    protected boolean endOfGame() {
        // Return true if in Checkmate or Stalemate has been reached
        System.out.println("The method or operation is not implemented.");
        return true;
    }

    @Override
    protected void showWinner() {
        // Display the winning player
        System.out.println("The method or operation is not implemented.");
    }

    /* Specific declarations for the chess game. */

    // ...
}

public class GamesDemo {

    public static void main(String[] args) {
        Game monopolyGame = new Monopoly();
        monopolyGame.playOnce(4);

        Game chessGame = new Chess();
        chessGame.playOnce(2);
    }
}