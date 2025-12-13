package ru.netology.unit;

public class main {
    public static void main(String[] args) {
        CashbackHackerService service = new CashbackHackerService();
        int counter = service.remain(999);
        if (counter < 1000){
            System.out.println("Чтобы получить больше бонусов, докупите до 1000 рублей.");
        }
        else {
            System.out.println("Вы получили бонусы");
        }

    }
}

