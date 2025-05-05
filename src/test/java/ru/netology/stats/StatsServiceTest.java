package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void ofAllSales() {
        StatsService cervice = new StatsService();
        int[] monthArray = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expectedAmount = 180;
        int actualAmount = cervice.totalSalesAmount(monthArray);
        Assertions.assertEquals(expectedAmount, actualAmount);
    }
    @Test
    public void averageAmount(){
        StatsService service = new StatsService();

        int[] montArray = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expectedMontArray = 15;
        int actualMontArray = service.averageSales(montArray);
        Assertions.assertEquals(expectedMontArray, actualMontArray);
    }

    @Test
    public  void maxAmount(){
        StatsService service = new StatsService();
        int[] montArray = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expectedMaxSales = 5;
        int actualMaxales = service.maximumSaleDay(montArray);
        Assertions.assertEquals(expectedMaxSales, actualMaxales);
    }

    @Test
    public void minAmount(){
        StatsService cervice = new StatsService();
        int[] montArrey = {
                8, 15, 13, 15, 17, 20, 19, 2, 7, 14, 14, 18
        };
        int expectedMinDay = 7;
        int actualMinDay = cervice.minimumSalesDay(montArrey);
        Assertions.assertEquals(expectedMinDay, actualMinDay);
    }

    @Test
    public void minAverageSales(){
        StatsService cervice = new StatsService();
        int[] montArrey = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expectedAveregeSales = 7;
        int actualAveregeSales = cervice.minAverageSales(montArrey);
        Assertions.assertEquals(expectedAveregeSales, actualAveregeSales);
    }
    @Test
    public void maxAveregeSales(){
        StatsService service = new StatsService();
        int[] montArrey = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expectedAveregeSales = 7;
        int actualAveregeSales = service.maxAveregeSales(montArrey);
        Assertions.assertEquals(expectedAveregeSales, actualAveregeSales);
    }
}