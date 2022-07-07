package ru.netology.bonus.calculator.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class BonusServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/data.csv")

    public void shouldFindBonus(long expectedBonus, boolean registered, long bonusReg, long bonusNotReg, long amountToAdd, long maxBonus) {
        BonusService service = new BonusService();
        long actualBonus = service.calculate(registered, bonusReg, bonusNotReg, amountToAdd, maxBonus);

        Assertions.assertEquals(expectedBonus, actualBonus);
    }
}