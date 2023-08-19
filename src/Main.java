public class Main {
    public static void main(String[] args) {
        int chek = 100;
        int topup1 = 315;
        int topup2 = 1400;
        int balance1 = chek + topup1;
        System.out.println("Баланс счёта = " + balance1);
        int bonus;
        if (topup2 > 1000) {
            bonus = topup2 / 100;
            int balance2 = bonus + chek + topup2;
            System.out.println("Баланс счёта = " + balance2);
            System.out.println("Бонусов = " + bonus);
        }
    }
}