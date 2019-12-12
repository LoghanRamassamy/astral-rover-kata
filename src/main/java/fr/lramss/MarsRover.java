package fr.lramss;

public class MarsRover {
    public static final String SEPARATOR = ":";
    public static final char MOVE = 'M';
    public static final char LEFT = 'L';
    public static final char RIGHT = 'R';
    private static final int GRID_SIZE = 10;

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
            if (isAMove(command)) {
                move();
            }
            if (isARotation(command)) {
                rotate(command);
            }
        }
        return x + SEPARATOR + y + SEPARATOR + direction;
    }

    private void move() {
        if (Direction.EAST.equals(direction)) {
            x = movePositively(x);
        }
        if (Direction.WEST.equals(direction)) {
            x = moveNegatively(x);
        }
        if (Direction.NORTH.equals(direction)) {
            y = movePositively(y);
        }
        if (Direction.SOUTH.equals(direction)) {
            y = moveNegatively(y);
        }
    }

    private int movePositively(int position) {
        position++;
        if (position % GRID_SIZE == 0) {
            position = 0;
        }
        return position;
    }

    private int moveNegatively(int position) {
        position--;
        if (position < 0) {
            position = GRID_SIZE - 1;
        }
        return position;
    }

    private void rotate(char command) {
        if (command == LEFT) {
            direction = direction.rotateLeft();
        } else {
            direction = direction.rotateRight();
        }
    }

    private boolean isARotation(char command) {
        return LEFT == command || RIGHT == command;
    }

    private boolean isAMove(char command) {
        return MOVE == command;
    }

}
