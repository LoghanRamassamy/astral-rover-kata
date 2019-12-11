package fr.lramss;

public class MarsRover {
    public static final String SEPARATOR = ":";
    private static final int GRID_SIZE = 10;
    int x = 0;
    int y = 0;
    private String direction = "N";

    public String execute(String commands) {
        for (char command : commands.toCharArray()) {
            if (isAMove(command))
                moveY();
            if (isARotation(command))
                rotate(command);
        }
        return x + SEPARATOR + y + SEPARATOR + direction;
    }

    private boolean isARotation(char command) {
        return 'L' == command || 'R' == command;
    }

    private boolean isAMove(char command) {
        return 'M' == command;
    }

    private void rotate(char command) {
        direction = "E";
    }

    private void moveY() {
        y++;
        if (isEndOfGrid())
            y = 0;
    }

    private boolean isEndOfGrid() {
        return y % GRID_SIZE == 0;
    }

}
