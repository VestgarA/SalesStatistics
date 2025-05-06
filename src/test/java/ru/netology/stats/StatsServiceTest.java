package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void ofAllSales() {
        StatsService cervice = new StatsService();
        long[] monthlySalesReport = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expectedAmount = 180;
        long actualAmount = cervice.totalSalesAmount(monthlySalesReport);
        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void averageAmount() {
        StatsService service = new StatsService();

        long[] monthlySalesReport = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expectedMontArray = 15;
        long actualMontArray = service.averageSales(monthlySalesReport);
        Assertions.assertEquals(expectedMontArray, actualMontArray);
    }

    @Test
    public void maxAmount() {
        StatsService service = new StatsService();
        long[] monthlySalesReport = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expectedMaxSales = 5;
        long actualMaxales = service.maximumSaleDay(monthlySalesReport);
        Assertions.assertEquals(expectedMaxSales, actualMaxales);
    }

    @Test
    public void minAmount() {
        StatsService cervice = new StatsService();
        long[] monthlySalesReport = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expectedMinDay = 8;
        long actualMinDay = cervice.minimumSalesDay(monthlySalesReport);
        Assertions.assertEquals(expectedMinDay, actualMinDay);
    }

    @Test
    public void minAverageSales() {
        StatsService cervice = new StatsService();
        long[] monthlySalesReport = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expectedAveregeSales = 7;
        long actualAveregeSales = cervice.minAverageSales(monthlySalesReport);
        Assertions.assertEquals(expectedAveregeSales, actualAveregeSales);
    }

    @Test
    public void maxAveregeSales() {
        StatsService service = new StatsService();
        long[] monthlySalesReport = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expectedAveregeSales = 7;
        long actualAveregeSales = service.maxAveregeSales(monthlySalesReport);
        Assertions.assertEquals(expectedAveregeSales, actualAveregeSales);
    }
}