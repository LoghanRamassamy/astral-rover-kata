package fr.lramss;

import java.util.stream.IntStream;

public enum Direction {
    NORTH('N'),
    EST('E'),
    SOUTH('S'),
    WEST('W');

    public static final Direction[] VALUES = values();
    private final char value;

    Direction(char value) {
        this.value = value;
    }

    public Direction rotate(char command) {
        if (command == 'L') return rotateLeft();
        return rotateRight();
    }

    public Direction rotateLeft() {
        int currentIndex = findCurrentIndex();
        int indexNewDirection;
        if (currentIndex == 0) {
            indexNewDirection = VALUES.length - 1;
        } else {
            indexNewDirection = currentIndex - 1;
        }
        return VALUES[indexNewDirection];
    }

    private int findCurrentIndex() {
        return IntStream.range(0, VALUES.length)
                .filter(i -> VALUES[i].value == value)
                .findFirst()
                .orElse(0);
    }

    public Direction rotateRight() {
        int currentIndex = findCurrentIndex();
        int indexNewDirection;
        if (currentIndex == VALUES.length - 1) {
            indexNewDirection = 0;
        } else {
            indexNewDirection = currentIndex + 1;
        }
        return VALUES[indexNewDirection];
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
