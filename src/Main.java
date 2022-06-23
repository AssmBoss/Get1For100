public class Main {
    public static void main(String[] args) {

        int account = 100;
        int payment = 1100;
        int premiumPaymentRate = 1000;
        int bonusStep = 100;
        int bonuses = 0;
        boolean isOk = true;

        if (payment <= 0) {
            System.out.println("Ошибка: введена неверная сумма платежа");
            isOk = false;
        }
        if (premiumPaymentRate < 0) {
            System.out.println("Ошибка: введен отрицательный уровень платежа, выше которого начисляются бонусы");
            isOk = false;
        }
        if (bonusStep <= 0) {
            System.out.println("Ошибка: введен отрицательный или нулевой размер части платежа, за который начисляется 1 руб. бонуса");
            isOk = false;
        }
        if (isOk) {
            if (payment - premiumPaymentRate > 0) {
                bonuses = payment / bonusStep;
            }
            account = account + payment + bonuses;
            System.out.println("На Вашем счету после пополнения: " + account + " руб.");
            System.out.println("Из них бонусных: " + bonuses + " руб.");
        }
    }
}
