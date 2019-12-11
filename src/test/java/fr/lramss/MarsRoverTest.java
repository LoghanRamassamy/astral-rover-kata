package fr.lramss;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class MarsRoverTest {

    @ParameterizedTest
    @CsvSource({
            "M, 0:1:N",
            "MM, 0:2:N",
            "MMM, 0:3:N",
    })
    public void execute_straight_moves(String commands, String expected) {
        // Given
        MarsRover marsRover = new MarsRover();
        // When
        String result = marsRover.execute(commands);
        // Then
        assertThat(result).isEqualTo(expected);
    }

    // reaches the end of the grid
    @Test
    public void reach_the_end_of_grid() {
        // Given
        MarsRover marsRover = new MarsRover();
        // When
        String result = marsRover.execute("MMMMMMMMMM");
        // Then
        assertThat(result).isEqualTo("0:0:N");
    }
}
