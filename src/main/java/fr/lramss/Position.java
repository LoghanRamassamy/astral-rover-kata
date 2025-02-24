package fr.lramss;

public class Position {
    private static final String SEPARATOR = ":";
    private final int x;
    private final int y;

    public Position(int x, int y) {

        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return x + SEPARATOR + y ;
    }
}
