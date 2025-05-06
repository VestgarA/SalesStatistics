package ru.netology.stats;

public class StatsService {
    public int totalSalesAmount(long[] monthlySalesReport) {
        int totalAmount = 0;
        for (long sale : monthlySalesReport) {
            totalAmount += sale;
        }
        return totalAmount;
    }

    public int averageSales(long[] monthlySalesReport) {
        int temp = monthlySalesReport.length;
        int metod = totalSalesAmount(monthlySalesReport);
        int averageAmount = metod / temp;
        return averageAmount;
    }

    public int maximumSaleDay(long[] monthlySalesReport) {
        int maxSales = 0;

        for (int i = 0; i < monthlySalesReport.length; i++) {
            if (monthlySalesReport[i] > monthlySalesReport[maxSales]) {
                maxSales = i;
            }
        }
        return maxSales;
    }

    public int minimumSalesDay(long[] monthlySalesReport) {
        int minSales = 0;
        for (int i = 0; i < monthlySalesReport.length; i++) {
            if (monthlySalesReport[i] < monthlySalesReport[minSales]) {
                minSales = i;
            }
        }
        return minSales;
    }

    public int minAverageSales(long[] monthlySalesReport) {
        int min = 0;
        long averageSalesAmount = averageSales(monthlySalesReport); // Добавил long т.к. здесь ссылаемся на другой код с массивом продаж.
        for (int i = 0; i < monthlySalesReport.length; i++) {
            if (monthlySalesReport[i] >= averageSalesAmount) {
                min++;
            }
        }
        return min;
    }

    public int maxAveregeSales(long[] monthlySalesReport) {
        int max = 0;
        long averageSalesAmount = averageSales(monthlySalesReport); // Добавил long т.к. здесь ссылаемся на другой код с массивом продаж.
        for (int i = 0; i < monthlySalesReport.length; i++) {
            if (monthlySalesReport[i] <= averageSalesAmount) {
                max++;
            }
        }
        return max;
    }
}



