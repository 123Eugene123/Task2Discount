public class Main {
    public static void main(String[] args) {
        int chek = 100;
        int topup = 1100;
        int bonus;
        if (topup > 0) {
            bonus = topup / 100;
            int balance = bonus + chek + topup;
            System.out.println("Баланс счёта = " + balance + " рублей");
            System.out.println("Бонусов = " + bonus+ " рублей");
        }
    }
}