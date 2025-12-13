package ru.netology.unit;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testng {
    @Test
    public void Test1() {
        CashbackHackerService service = new CashbackHackerService();
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }
    @Test
    public void Test2() {
        CashbackHackerService service = new CashbackHackerService();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }
}

