package ru.netology.stats;

public class StatsService {
    public int totalSalesAmount(int[] montArrey) {
        int totalAmount = 0;
        for (int sale : montArrey) {
            totalAmount += sale;
        }
        return totalAmount;
    }

    public int averageSales(int[] montArrey) {
        int temp = montArrey.length;
        int metod = totalSalesAmount(montArrey);
        int averageAmount = metod / temp;
        return averageAmount;
    }

    public int maximumSaleDay(int[] montArrey) {
        int maxSales = 0;

        for (int i = 0; i < montArrey.length; i++) {
            if (montArrey[i] > montArrey[maxSales]) {
                maxSales = i;
            }
        }
        return maxSales;
    }

    public int minimumSalesDay(int[] montArrey) {
        int minSales = 0;
        for (int i = 0; i < montArrey.length; i++) {
            if (montArrey[i] < montArrey[minSales]) {
                minSales = i;
            }
        }
        return minSales;
    }

    public int minAverageSales(int[] montArrey) {
        int min = 0;
        for (int i = 0; i < montArrey.length; i++) {
            if (montArrey[i] >= averageSales(montArrey)) {
                min++;
            }
        }
        return min;
    }

    public int maxAveregeSales(int[] montArrey) {
        int max = 0;
        for (int i = 0; i < montArrey.length; i++){
            if (montArrey[i] <= averageSales(montArrey)){
                max++;
            }
        }
     return max;
    }
}



