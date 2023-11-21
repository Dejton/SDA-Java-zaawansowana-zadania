package Zadanie8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ParcelValidatorTest {
    private ParcelValidator validator;

    @BeforeEach
    void init() {
        validator = new ParcelValidator();
    }
    @Test
    void shouldWorkIfAllIdGoodAndIsExpress() {
//        given
        Parcel parcel = new Parcel(40,40,40,14.0f, true);
//        when
        boolean result = validator.validate(parcel);
//        then
        assertTrue(result);
    }
    @Test
    void shouldWorkIfAllIdGoodAndIsNotExpress() {
//        given
        Parcel parcel = new Parcel(40,40,40,24.0f, false);
//        when
        boolean result = validator.validate(parcel);
//        then
        assertTrue(result);
    }
    @Test
    void shouldWorkIfMaxDimensionsAndIsExpress() {
//        given
        Parcel parcel = new Parcel(100,100,100,15.0f, true);
//        when
        boolean result = validator.validate(parcel);
//        then
        assertTrue(result);
    }
    @Test
    void shouldWorkIfMaxDimensionsAndIsNotExpress() {
//        given
        Parcel parcel = new Parcel(100,100,100,30.0f, false);
//        when
        boolean result = validator.validate(parcel);
//        then
        assertTrue(result);
    }
    @Test
    void shouldWorkIfMinDimensionsAndIsExpress() {
//        given
        Parcel parcel = new Parcel(30,30,30,1f, true);
//        when
        boolean result = validator.validate(parcel);
//        then
        assertTrue(result);
    }
    @Test
    void shouldWorkIfMinDimensionsAndIsNotExpress() {
//        given
        Parcel parcel = new Parcel(30,30,30,1f, false);
//        when
        boolean result = validator.validate(parcel);
//        then
        assertTrue(result);
    }
    @Test
    void shouldNotWorkIfDimensionsAre0AndIsExpress() {
//        given
        Parcel parcel = new Parcel(0,0,0,1f, true);
//        when
        boolean result = validator.validate(parcel);
//        then
        assertFalse(result);
    }
    @Test
    void shouldNotWorkIfDimensionsAre0AndIsNotExpress() {
//        given
        Parcel parcel = new Parcel(0,0,0,1f, false);
//        when
        boolean result = validator.validate(parcel);
//        then
        assertFalse(result);
    }
    @Test
    void shouldNotWorkIfDimensionsAreMoreThanMaxAndIsExpress() {
//        given
        Parcel parcel = new Parcel(120,120,120,14f, true);
//        when
        boolean result = validator.validate(parcel);
//        then
        assertFalse(result);
    }
    @Test
    void shouldNotWorkIfDimensionsAreMoreThanMaxAndIsNotExpress() {
//        given
        Parcel parcel = new Parcel(120,120,120,14f, false);
//        when
        boolean result = validator.validate(parcel);
//        then
        assertFalse(result);
    }
    @Test
    void shouldNotWorkIfOneDimensionIsTooBig() {
//        given
        Parcel parcel = new Parcel(300,0,0,14f, true);
//        when
        boolean result = validator.validate(parcel);
//        then
        assertFalse(result);
    }
    @Test
    void shouldNotWorkIfDimensionsAreOkWeightIs0AndIsExpress() {
//        given
        Parcel parcel = new Parcel(30,60,50,0f, true);
//        when
        boolean result = validator.validate(parcel);
//        then
        assertFalse(result);
    }
    @Test
    void shouldNotWorkIfDimensionsAreOkWeightIs0AndIsNotExpress() {
//        given
        Parcel parcel = new Parcel(30,60,50,0f, false);
//        when
        boolean result = validator.validate(parcel);
//        then
        assertFalse(result);
    }
    @Test
    void shouldNotWorkIfDimensionsAreOkAndWeightIsTooBigForExpress() {
//        given
        Parcel parcel = new Parcel(50,35,70,17f, true);
//        when
        boolean result = validator.validate(parcel);
//        then
        assertFalse(result);
    }
    @Test
    void shouldNotWorkIfDimensionsAreOkAndWeightIsTooBigForNotExpress() {
//        given
        Parcel parcel = new Parcel(50,35,70,31f, true);
//        when
        boolean result = validator.validate(parcel);
//        then
        assertFalse(result);
    }

}