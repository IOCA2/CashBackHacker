package ru.netology.unit;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class junit4 {
    @Test
    public void Test1(){
        CashbackHackerService service = new CashbackHackerService();
        int amount = 1100;
        int actual = service.remain(amount);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
}
    @Test
    public void Test2(){
        CashbackHackerService service = new CashbackHackerService();
        int amount = 2000;
        int actual = service.remain(amount);
        int expected = 10;
        Assertions.assertEquals(expected, actual);
    }









}


