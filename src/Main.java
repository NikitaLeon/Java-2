//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int replenishment = 1001;
        int bonus = replenishment / 100;
        if (replenishment > 1000) {
            System.out.println("Сумма бонусов:");
            System.out.println(replenishment / 100);
        }
        if (replenishment <= 1000) {
            System.out.println("Сумма бонусов:");
            System.out.println(0);
        }
        int amount = balance + replenishment + bonus;
        if (replenishment > 1000) {
            System.out.println("Итоговый счёт:");
            System.out.println(balance + replenishment + bonus);
        }
        if  (replenishment <= 1000) {
            System.out.println("Итоговый счёт:");
            System.out.println(balance + replenishment);
        }



    }

}