package ru.netology.bonus.calculator.services;

public class BonusService {

    public long calculate(boolean registered, long bonusReg, long bonusNotReg, long amountToAdd, long maxBonus) {

        long percent = registered ? bonusReg : bonusNotReg;
        long bonus = amountToAdd * percent / 100;
        if (bonus > maxBonus) {
            bonus = maxBonus;
        }
        return bonus;
    }
}