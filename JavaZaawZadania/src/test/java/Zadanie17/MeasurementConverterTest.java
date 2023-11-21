package Zadanie17;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MeasurementConverterTest {
@Test
    void shouldReturnMetersToYards() {
//    given
    double expected = 37.06;
//    when
    double result = MeasurementConverter.convert(34, ConversionTypeWithFunction.METERS_TO_YARDS);
//    then
    assertThat(result).isEqualTo(expected);
}
    @Test
    void shouldReturnYardsToMeters() {
//    given
        double expected = 15;
//    when
        double result = MeasurementConverter.convert(16.35, ConversionTypeWithFunction.YARDS_TO_METERS);
//    then
        assertThat(result).isEqualTo(expected);
    }
}