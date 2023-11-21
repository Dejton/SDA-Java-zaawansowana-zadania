package Zadanie15;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    void shouldFerrariReturnTrueIfTestIsPremium() {
//        when
        boolean result = Car.FERRARI.isPremium();
//        then
        assertTrue(result);
    }

    @Test
    void shouldFerrariReturnFalseIfTestIsRegular() {
//        when
        boolean result = Car.FERRARI.isRegular();
//        then
        assertFalse(result);
    }
    @Test
    void shouldMercedesReturnFalseIfTestIsPremium() {
//        when
        boolean result = Car.MERCEDES.isPremium();
//        then
        assertFalse(result);
    }

    @Test
    void shouldMercedesReturnTrueIfTestIsRegular() {
//        when
        boolean result = Car.MERCEDES.isRegular();
//        then
        assertTrue(result);
    }
    @Test
    void shouldReturnTrueIfFerrariFasterThanMercedes() {
//        when
        boolean result = Car.FERRARI.isFasterThan(Car.MERCEDES);
//        then
        assertTrue(result);
    }
    @Test
    void shouldReturnFalseIfOpelFasterThanPorsche() {
//        when
        boolean result = Car.OPEL.isFasterThan(Car.PORSCHE);
//        then
        assertFalse(result);
    }
    @Test
    void shouldReturnTrueIfSpeedIsTheSame() {
//        when
        boolean result = Car.BMW.isFasterThan(Car.OPEL);
//        then
        assertFalse(result);
    }
}