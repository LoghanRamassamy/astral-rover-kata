package fr.lramss;

import org.junit.jupiter.api.Test;

import java.sql.PreparedStatement;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void toto() {
        MarsRover marsRover = new MarsRover();
        assertThat(marsRover.execute("M")).isEqualTo("0:1:N");
    }
}
