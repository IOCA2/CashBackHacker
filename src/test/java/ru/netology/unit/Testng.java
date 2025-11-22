package ru.netology.unit;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Testng {
    @Test
    public void ShouldCalculateService() {
        BonusService service = new BonusService();
        int amount = 10_000;

        int actual = service.calculateBonus(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void ShouldCalculateService2() {
        BonusService service = new BonusService();
        int amount = 5_000;

        int actual = service.calculateBonus(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }
}
