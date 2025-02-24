package fr.lramss;

public class Rover {
    private final String SEPARATOR = ":";
    private final char LEFT = 'L';
    private final char RIGHT = 'R';
    private Position position;
    private Grid grid;

    private Direction direction;

    public Rover(Grid grid) {
        position = new Position(0, 0);
        this.direction = Direction.NORTH;
        this.grid = grid;
    }

    public void rotate(char command) {
        if (command == this.LEFT) {
            this.direction = this.direction.rotateLeft();
        }
        if (command == this.RIGHT) {
            this.direction = this.direction.rotateRight();
        }
    }


    public void moveTo(Position nextPosition) {
        position = nextPosition;

    }

    public Position calculateNextPosition() {
        int x = nextPositionX(position.getX());
        int y = nextPositionY(position.getY());
        return new Position(x, y);
    }

    private int nextPositionY(int position) {
        int result = 0;
        if (Direction.NORTH.equals(this.direction)) {
            result = increment(position);
        }
        if (Direction.SOUTH.equals(this.direction)) {
            result = decrement(position);
        }
        return result;
    }

    private int nextPositionX(int position) {
        int result = 0;
        if (Direction.EAST.equals(this.direction)) {
            result = increment(position);
        }
        if (Direction.WEST.equals(this.direction)) {
            result = decrement(position);
        }
        return result;
    }


    private int increment(int position) {
        position++;
        if (position == grid.getSize()) {
            position = 0;
        }
        return position;
    }

    private int decrement(int position) {
        position--;
        if (position == -1) {
            position = grid.getSize() - 1;
        }
        return position;
    }

    @Override
    public String toString() {
        return position + SEPARATOR + direction;
    }
}
