package Zadanie16;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RunnerTest {
    @Test
    void shouldReturnInter() {
//        given
        Runner expected = Runner.INTERMEDIATE;
//        when
        Runner result = Runner.getFitnessLevel(300);
//        then
        assertThat(result).isEqualTo(expected);
    }
    @Test
    void shouldReturnAdvanced() {
//        given
        Runner expected = Runner.ADVANCED;
//        when
        Runner result = Runner.getFitnessLevel(165);
//        then
        assertThat(result).isEqualTo(expected);
    }
    @Test
    void shouldReturnBeginner() {
//        given
        Runner expected = Runner.BEGINNER;
//        when
        Runner result = Runner.getFitnessLevel(600);
//        then
        assertThat(result).isEqualTo(expected);
    }
    @Test
    void shouldReturnAdvIf256() {
//        given
        Runner expected = Runner.ADVANCED;
//        when
        Runner result = Runner.getFitnessLevel(256);
//        then
        assertThat(result).isEqualTo(expected);
    }
    @Test
    void shouldReturnAdvIf150() {
//        given
        Runner expected = Runner.ADVANCED;
//        when
        Runner result = Runner.getFitnessLevel(150);
//        then
        assertThat(result).isEqualTo(expected);
    }
    @Test
    void shouldReturnBeginnerIf513() {
//        given
        Runner expected = Runner.BEGINNER;
//        when
        Runner result = Runner.getFitnessLevel(513);
//        then
        assertThat(result).isEqualTo(expected);
    }


}