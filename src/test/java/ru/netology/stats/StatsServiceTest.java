package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void ofAllSales() {
        StatsService cervice = new StatsService();
        long[] monthlySalesReport = { // это массив продаж, может быть больше 2.5 милиарда
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        long expectedAmount = 180; // здесь сумма может быть больше 2.5 милиарда
        long actualAmount = cervice.totalSalesAmount(monthlySalesReport); // принимает сумму возможно > 2.5 милиарда
        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void averageAmount() {
        StatsService service = new StatsService();

        long[] monthlySalesReport = { // это массив продаж, может быть больше 2.5 милиарда
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        long expectedMontArray = 15; // здесь сумма может быть больше 2.5 милиарда
        long actualMontArray = service.averageSales(monthlySalesReport); // принимает сумму возможно > 2.5 милиарда
        Assertions.assertEquals(expectedMontArray, actualMontArray);
    }

    @Test
    public void maxAmount() {
        StatsService service = new StatsService();
        long[] monthlySalesReport = { // это массив продаж, может быть больше 2.5 милиарда
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expectedMaxSales = 5; // номер месяца < 2.5 милиарда
        long actualMaxales = service.maximumSaleDay(monthlySalesReport);
        Assertions.assertEquals(expectedMaxSales, actualMaxales);
    }

    @Test
    public void minAmount() {
        StatsService cervice = new StatsService();
        long[] monthlySalesReport = { // это массив продаж, может быть больше 2.5 милиарда
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expectedMinDay = 8; // номер месяца < 2.5 милиарда
        int actualMinDay = cervice.minimumSalesDay(monthlySalesReport); // принимает номер месяца < 2.5 милиарда
        Assertions.assertEquals(expectedMinDay, actualMinDay);
    }

    @Test
    public void minAverageSales() {
        StatsService cervice = new StatsService();
        long[] monthlySalesReport = { // это массив продаж, может быть больше 2.5 милиарда
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expectedAveregeSales = 7; // номер месяца < 2.5 милиарда
        int actualAveregeSales = cervice.minAverageSales(monthlySalesReport); // принимает номер месяца < 2.5 милиарда
        Assertions.assertEquals(expectedAveregeSales, actualAveregeSales);
    }

    @Test
    public void maxAveregeSales() {
        StatsService service = new StatsService();
        long[] monthlySalesReport = { // это массив продаж, может быть больше 2.5 милиарда
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expectedAveregeSales = 7; // номер месяца < 2.5 милиарда
        int actualAveregeSales = service.maxAveregeSales(monthlySalesReport); // принимает номер месяца < 2.5 милиарда
        Assertions.assertEquals(expectedAveregeSales, actualAveregeSales);
    }
}