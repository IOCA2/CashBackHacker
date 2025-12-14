package ru.netology.unit;

//public class CashbackHackerService {
//    public int remain(int amount) {
//        int boundary = 1000;
//        return boundary - amount % boundary;
//    }
//}

/// Считаю, что первый сервисный класс нужно оставить, мало ли он будет правильный.
public class CashbackHackerService {
    public int remain(int amount) {
        if (amount < 1000) {
            return 0;
        }
        int bonus = (amount - 1000) / 100;
        if (bonus > 1000) {
            return 100;
        }
        return bonus;
    }
}

