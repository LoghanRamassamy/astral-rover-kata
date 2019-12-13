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

    public boolean isThereAnObstacleAt(Position p) {
        return this.values[p.getX()][p.getY()] == "O";
    }

    public int getSize() {
        return this.width;
    }
}
