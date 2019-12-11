package fr.lramss;

import org.junit.jupiter.api.Test;

import java.sql.PreparedStatement;

import static org.assertj.core.api.Assertions.assertThat;

public class MarsRoverTest {

    @Test
    public void execute_one_move() {
        MarsRover marsRover = new MarsRover();
        assertThat(marsRover.execute("M")).isEqualTo("0:1:N");
    }

    @Test
    public void execute_two_moves() {
        MarsRover marsRover = new MarsRover();
        assertThat(marsRover.execute("MM")).isEqualTo("0:2:N");
    }

    @Test
    public void execute_three_moves() {
        MarsRover marsRover = new MarsRover();
        assertThat(marsRover.execute("MMM")).isEqualTo("0:3:N");
    }
}
