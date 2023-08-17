public class Main {
    public static void main(String[] args) {
        int chek = 100;
        int x = 315;
        int y = 1400;
        int balance1 = chek + x;
        System.out.println("Баланс счёта = " + balance1);
        int bonus;
        if (y > 1000) {
            bonus = y / 100;
            int balance2 = bonus + chek + y;
            System.out.println("Баланс счёта = " + balance2);
            System.out.println("Бонусов = " + bonus);
        }

    }
}