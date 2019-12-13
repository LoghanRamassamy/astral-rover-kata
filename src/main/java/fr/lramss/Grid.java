package fr.lramss;

public class Grid {
    private final int height;
    private final int width;
    private String[][] values;

    public Grid(int height, int width) {
        this.values = new String[height][width];
        this.height = height;
        this.width = width;
    }

    public void addObstacle(int x, int y) {
        this.values[x][y] = "O";
    }

    public boolean isThereAnObstacle(int x, int y) {
        return this.values[x][y] == "O";
    }
}
