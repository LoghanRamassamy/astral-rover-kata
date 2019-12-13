package fr.lramss;

public class Terminal {

    public static final char MOVE = 'M';
    public static final char LEFT = 'L';
    public static final char RIGHT = 'R';
    private static final String SEPARATOR = ":";
    private final Rover rover;
    private Grid grid;

    public Terminal() {
        this.grid = new Grid(10, 10);
        this.rover = new Rover(this.grid);
    }

    public Terminal(Grid grid) {
        this.grid = grid;
        this.rover = new Rover(this.grid);
    }

    public String execute(String commands) {

        for (char command : commands.toCharArray()) {
            if (isAMove(command)) {
                Position nextPosition = rover.calculateNextPosition();
                if (grid.isThereAnObstacleAt(nextPosition)) {
                    String obstacleFlag = "O" + SEPARATOR;
                    return obstacleFlag + rover.toString();
                }
                rover.moveTo(nextPosition);

            }
            if (isARotation(command)) {
                rover.rotate(command);
            }
        }
        return rover.toString();
    }

    private boolean isARotation(char command) {
        return LEFT == command || RIGHT == command;
    }

    private boolean isAMove(char command) {
        return MOVE == command;
    }

}
