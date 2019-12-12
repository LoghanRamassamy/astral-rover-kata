package fr.lramss;

import java.util.stream.IntStream;

public enum Direction {
    NORTH('N'),
    EAST('E'),
    SOUTH('S'),
    WEST('W');

    public static final Direction[] VALUES = values();
    private final char value;

    Direction(char value) {
        this.value = value;
    }

    private int calculateCurrentIndex() {
        return IntStream.range(0, VALUES.length)
                .filter(i -> VALUES[i].value == value)
                .findFirst()
                .orElse(0);
    }

    public Direction rotateLeft() {
        int currentIndex = calculateCurrentIndex();
        return VALUES[calculateLeftIndex(currentIndex)];
    }

    public Direction rotateRight() {
        int currentIndex = calculateCurrentIndex();
        return VALUES[calculateRightIndex(currentIndex)];
    }

    private int calculateLeftIndex(int currentIndex) {
        if (currentIndex == 0) {
            return VALUES.length - 1;
        }
        return currentIndex - 1;
    }

    private int calculateRightIndex(int currentIndex) {
        if (currentIndex == VALUES.length - 1) {
            return 0;
        }
        return currentIndex + 1;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
