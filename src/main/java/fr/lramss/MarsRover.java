package fr.lramss;

public class MarsRover {
    int x = 0;
    int y = 0;

    public String execute(String commands) {
        int nbMoves = commands.length();
        return x + ":" + moveY(nbMoves) + ":N";
    }

    private int moveY(int nbMoves) {
        return y + nbMoves;

    }
}
