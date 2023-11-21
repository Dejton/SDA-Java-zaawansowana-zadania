package Zadanie27;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class JoinerTest {
@Test
    void shouldWorkIfEmpty() {
//    given
    Joiner<String> joiner = new Joiner<>("");
    String expected = "abcde";
//    when
    String result = joiner.join("a", "b", "c", "d", "e");
//    then
    assertThat(result).isEqualTo(expected);
}
    @Test
    void shouldWorkIfSpace() {
//    given
        Joiner<String> joiner = new Joiner<>(" ");
        String expected = "a b c d e";
//    when
        String result = joiner.join("a", "b", "c", "d", "e");
//    then
        assertThat(result).isEqualTo(expected);
    }
    @Test
    void shouldWorkIfStar() {
//    given
        Joiner<String> joiner = new Joiner<>("*");
        String expected = "a*b*c*d*e";
//    when
        String result = joiner.join("a", "b", "c", "d", "e");
//    then
        assertThat(result).isEqualTo(expected);
    }
    @Test
    void shouldWorkIfLetter() {
//    given
        Joiner<String> joiner = new Joiner<>("g");
        String expected = "agbgcgdge";
//    when
        String result = joiner.join("a", "b", "c", "d", "e");
//    then
        assertThat(result).isEqualTo(expected);
    }
    @Test
    void shouldWorkIfNumber() {
//    given
        Joiner<String> joiner = new Joiner<>("0");
        String expected = "a0b0c0d0e";
//    when
        String result = joiner.join("a", "b", "c", "d", "e");
//    then
        assertThat(result).isEqualTo(expected);
    }
 @Test
    void shouldThrowException() {
//    given
     Joiner<String> joiner = new Joiner<>("abc");
//     when
//     then
     assertThrows(IllegalArgumentException.class, () -> {joiner.join("a", "b", "c", "d", "e");});
 }
}