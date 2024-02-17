package ru.netology.Java_HW_5.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VacationServiceTest {

    @Test
    public void CalcCountTest() {
        VacationService service = new VacationService();
        {
            int income = 10_000;
            int expenses = 3_000;
            int threshold = 20_000;
            int expectedCount = 3;

            int actualCount = service.calcCount(income, expenses, threshold);

            Assertions.assertEquals(expectedCount, actualCount);
        }

    }

    @Test
    public void CalcCountDifferentBudgetTest() {
        VacationService service = new VacationService();
        {
            int income = 100_000;
            int expenses = 60_000;
            int threshold = 150_000;
            int expectedCount = 2;

            int actualCount = service.calcCount(income, expenses, threshold);

            Assertions.assertEquals(expectedCount, actualCount);
        }

    }
}
