package fr.lramss;

public class MarsRover {
    public static final String SEPARATOR = ":";
    private static final int GRID_SIZE = 10;
    public static final char MOVE = 'M';
    public static final char LEFT = 'L';
    public static final char RIGHT = 'R';
    private int x;
    private int y;
    private Direction direction;

    public MarsRover() {
        this.x = 0;
        this.y = 0;
        this.direction = Direction.NORTH;
    }

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
        return LEFT == command || RIGHT == command;
    }

    private boolean isAMove(char command) {
        return MOVE == command;
    }

    private void rotate(char command) {
        direction = direction.rotate(command);
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
