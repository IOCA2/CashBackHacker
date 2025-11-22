package ru.netology.unit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class BonusServiceTest {
    @Test
    public void shouldReturn10IfAmount2000() {
        BonusService bonusService = new BonusService();
        int amount = 2000;

        int actual = bonusService.calculateBonus(amount);
        int expected = 10;

        assertEquals(expected, actual);
    }
    @Test
    public void shouldReturn10IfAmount1000() {
        BonusService bonusService = new BonusService();
        int amount = 1000;

        int actual = bonusService.calculateBonus(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }
}
