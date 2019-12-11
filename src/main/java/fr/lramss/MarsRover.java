package fr.lramss;

public class MarsRover {
    private static final int GRID_SIZE = 10;
    int x = 0;
    int y = 0;

    public String execute(String commands) {
        int nbMoves = commands.length() % GRID_SIZE;
        return x + ":" + moveY(nbMoves) + ":N";
    }

    private int moveY(int nbMoves) {
        return y + nbMoves;

    }
}
