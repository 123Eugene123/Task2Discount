public class Main {
    public static void main(String[] args) {
        int chek = 100;
        int topup = 1100;
        int bonus;
        if (topup > 1000) {
            bonus = topup / 100;
        } else {
            bonus = 0;
        }
        int balance = bonus + chek + topup;
        System.out.println("Баланс счёта = " + balance + " рублей");
        System.out.println("Бонусов = " + bonus + " рублей");
    }
}