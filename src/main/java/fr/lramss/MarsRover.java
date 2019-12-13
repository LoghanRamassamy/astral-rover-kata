package fr.lramss;

public class MarsRover {

    public static final char MOVE = 'M';
    public static final char LEFT = 'L';
    public static final char RIGHT = 'R';
    private final Rover rover;
    private Grid grid;

    public MarsRover() {
        this.rover = new Rover(new Grid(10, 10));
    }

    public MarsRover(Grid grid) {
        this.grid = grid;
        this.rover = new Rover(this.grid);
    }

    public String execute(String commands) {
        for (char command : commands.toCharArray()) {
            if (isAMove(command)) {
                boolean stop = rover.move();
                if(stop) return "O:" + rover.toString();

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
