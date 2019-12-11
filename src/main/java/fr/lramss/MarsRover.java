package fr.lramss;

public class MarsRover {
    public static final String SEPARATOR = ":";
    private static final int GRID_SIZE = 10;
    private static final String direction = "N";
    int x = 0;
    int y = 0;

    public String execute(String commands) {
        if ("R".equals(commands)) {
            return "0:0:E";
        }
        if ("L".equals(commands)) {
            return "0:0:W";
        }
        int nbMoves = commands.length() % GRID_SIZE;
        return x + SEPARATOR + moveY(nbMoves) + SEPARATOR + direction;
    }

    private int moveY(int nbMoves) {
        return y + nbMoves;

    }
}
