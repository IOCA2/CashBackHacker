import org.junit.jupiter.api.Test;
import ru.netology.unit.BonusService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class junit4 {
    @Test
    public void ShouldCalcServ() {
        BonusService service = new BonusService();
        int amount = 2_500;
        int actual = service.calculateBonus(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }

}
