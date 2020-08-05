public class Bonus {
    public static void main(String[] args) {
        int clientAccountInRoubles = 100;
        int depositSum = 1100;
        int bonusRate = 100;
        int bonus;
        int total;
        if (depositSum >= 1000) {
            bonus = depositSum / bonusRate;
            total = clientAccountInRoubles + depositSum + bonus;
        }
        else {
            bonus = 0;
            total = clientAccountInRoubles + depositSum;
        }
        System.out.println("Текущий баланс: " + clientAccountInRoubles + "₽");
        System.out.println("Будет зачислено: " + depositSum + "₽");
        System.out.println("Бонус от зачисления: " + bonus + "₽");
        System.out.println("Баланс после зачисления: " + total + "₽");
    }
}