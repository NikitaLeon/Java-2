//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int replenishment = 1001;
        int bonus;
        if (replenishment > 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        {
            System.out.println("Сумма бонусов:" + bonus);
        }
        int alone;
        if (replenishment > 1000) {
            alone = balance + replenishment + bonus;
        } else {
            alone = balance + replenishment;
        }
        {
            System.out.println("Итоговая сумма:" + alone);
        }


    }

}