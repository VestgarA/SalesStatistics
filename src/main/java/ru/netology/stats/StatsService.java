package ru.netology.stats;

public class StatsService {
    public long totalSalesAmount(long[] montArrey) {
        int totalAmount = 0;
        for (long sale : montArrey) {
            totalAmount += sale;
        }
        return totalAmount;
    }

    public long averageSales(long[] montArrey) {
        long temp = montArrey.length;
        long metod = totalSalesAmount(montArrey);
        long averageAmount = metod / temp;
        return averageAmount;
    }

    public long maximumSaleDay(long[] montArrey) {
        int maxSales = 0;

        for (int i = 0; i < montArrey.length; i++) {
            if (montArrey[i] > montArrey[maxSales]) {
                maxSales = i;
            }
        }
        return maxSales;
    }

    public long minimumSalesDay(long[] montArrey) {
        int minSales = 0;
        for (int i = 0; i < montArrey.length; i++) {
            if (montArrey[i] < montArrey[minSales]) {
                minSales = i;
            }
        }
        return minSales;
    }

    public long minAverageSales(long[] montArrey) {
        int min = 0;
        long averageSalesAmount = averageSales(montArrey);
        for (int i = 0; i < montArrey.length; i++) {
            if (montArrey[i] >= averageSalesAmount) {
                min++;
            }
        }
        return min;
    }

    public long maxAveregeSales(long[] montArrey) {
        int max = 0;
        long averageSalesAmount = averageSales(montArrey);
        for (int i = 0; i < montArrey.length; i++){
            if (montArrey[i] <= averageSalesAmount){
                max++;
            }
        }
     return max;
    }
}



