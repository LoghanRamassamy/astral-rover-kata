package fr.lramss;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class MarsRoverTest {
    MarsRover marsRover;

    @BeforeEach
    void setUp() {
        // Given
        marsRover = new MarsRover();
    }

    @ParameterizedTest
    @CsvSource({
            "M, 0:1:N",
            "MM, 0:2:N",
            "MMM, 0:3:N",
    })
    public void execute_straight_moves(String commands, String expected) {

        // When
        String result = marsRover.execute(commands);
        // Then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void reach_the_end_of_grid() {

        // When
        String result = marsRover.execute("M".repeat(10));
        // Then
        assertThat(result).isEqualTo("0:0:N");
    }

    @Test
    public void right_rotation_of_rover() {

        // When
        String result = marsRover.execute("R");
        // Then
        assertThat(result).isEqualTo("0:0:E");
    }

    @Test
    public void left_rotation_of_rover() {

        // When
        String result = marsRover.execute("L");
        // Then
        assertThat(result).isEqualTo("0:0:W");
    }
}
