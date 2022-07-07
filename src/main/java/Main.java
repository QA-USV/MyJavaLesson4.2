import ru.netology.bonus.calculator.services.BonusService;

public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        boolean registered = true;
        long bonusReg = 3; // Bonus in percents if a client is registered
        long bonusNotReg = 1; // Bonus in percents if a client is not registered
        long amountToAdd = 1000; // A sum to add to the account
        long maxBonus = 500; // A sum of the max bonus
        long bonus = service.calculate(registered, bonusReg, bonusNotReg, amountToAdd, maxBonus);
        System.out.println(bonus);
    }
}