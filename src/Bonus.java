public class Bonus {
    public static void main(String[] args) {
        int clientAccountInRoubles = 100;
        int depositSumInRoubles = 1100;
        int bonusRate = 100;
        int bonus;
        int total;
        if (depositSumInRoubles >= 1000) {
            bonus = depositSumInRoubles / bonusRate;
            total = clientAccountInRoubles + depositSumInRoubles + bonus;
        }
        else {
            bonus = 0;
            total = clientAccountInRoubles + depositSumInRoubles;
        }
        System.out.println("Текущий баланс: " + clientAccountInRoubles + "₽");
        System.out.println("Будет зачислено: " + depositSumInRoubles + "₽");
        System.out.println("Бонус от зачисления: " + bonus + "₽");
        System.out.println("Баланс после зачисления: " + total + "₽");
    }
}