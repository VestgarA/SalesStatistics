package ru.netology.stats;

// сумма всех продаж
// здесь везде лонг т.к. сумма продаж может быть больше int (2.5 миллиарда)
public class StatsService {
    public long totalSalesAmount(long[] monthlySalesReport) {
        long totalAmount = 0;
        for (long sale : monthlySalesReport) {
            totalAmount += sale;
        }
        return totalAmount;
    }

    // средняя сумма всех продаж
    public long averageSales(long[] monthlySalesReport) {
        int temp = monthlySalesReport.length; // int т.к. считаем колличество месяцев (влезет в int)
        long metod = totalSalesAmount(monthlySalesReport); // long т.к. сумма продаж > может быть больше 2.5 миллиарда
        long averageAmount = metod / temp; // long т.к. в metod храница сумма всех продаж
        return averageAmount;
    }

    // номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
// public int т.к. считаем номер месяца, long[] monthlySalesReport т.к. это массив продаж
    public int maximumSaleDay(long[] monthlySalesReport) {
        int maxSales = 0; // здесь храним номер месяца

        for (int i = 0; i < monthlySalesReport.length; i++) {
            if (monthlySalesReport[i] > monthlySalesReport[maxSales]) {
                maxSales = i;
            }
        }
        return maxSales;
    }

    // номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
// public int т.к. считаем номер месяца, long[] monthlySalesReport т.к. это массив продаж
    public int minimumSalesDay(long[] monthlySalesReport) {
        int minSales = 0; //здесь храним номер месяца

        for (int i = 0; i < monthlySalesReport.length; i++) {
            if (monthlySalesReport[i] < monthlySalesReport[minSales]) {
                minSales = i;
            }
        }
        return minSales;
    }

    // количество месяцев, в которых продажи были ниже среднего
// public int т.к. считаем номер месяца, long[] monthlySalesReport т.к. это массив продаж
    public int minAverageSales(long[] monthlySalesReport) {
        int min = 0; // здесь храним количество месяцев
        long averageSalesAmount = averageSales(monthlySalesReport); // Добавил long т.к. здесь ссылаемся на другой код с массивом продаж.
        for (int i = 0; i < monthlySalesReport.length; i++) {
            if (monthlySalesReport[i] >= averageSalesAmount) {
                min++;
            }
        }
        return min;
    }

    // количество месяцев, в которых продажи были выше среднего
// public int т.к. считаем номер месяца, long[] monthlySalesReport т.к. это массив продаж
    public int maxAveregeSales(long[] monthlySalesReport) {
        int max = 0; //здесь храним количество месяцев
        long averageSalesAmount = averageSales(monthlySalesReport); // Добавил long т.к. здесь ссылаемся на другой код с массивом продаж.
        for (int i = 0; i < monthlySalesReport.length; i++) {
            if (monthlySalesReport[i] <= averageSalesAmount) {
                max++;
            }
        }
        return max;
    }
}



