package ru.netology.stats;

public class StatsService {

    public long sum(long[] sales) {
        long sumSale = 0; // сумма всех продаж
        for (long sale : sales) {
            sumSale += sale;
        }
        return sumSale;
    }

    public long average(long[] sales) {
        long sumSale = sum(sales);
        long averageSale = sumSale / sales.length;

        return averageSale;
    }

    public int maxMonthSale(long[] sales) {
        int maxMonth = 0; // Номер месяца с максимальными продажами
        for (int i = 0; i < sales.length; i++) {
            if (sales[maxMonth] <= sales[i]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;

    }

    public int minMonthSale(long[] sales) {
        int minMonth = 0; // Номер месяца с минимальными продажами
        for (int i = 0; i < sales.length; i++) {
            if (sales[minMonth] >= sales[i]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int monthsBelowAverage(long[] sales) {
        int months = 0; // месяцы продаж ниже среднего
        long averageSale = average(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSale) {
                months++;
            }
        }
        return months;
    }

    public int monthsAboveAverage(long[] sales) {
        int months = 0; // месяцы продаж ниже среднего
        long averageSale = average(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSale) {
                months++;
            }
        }
        return months;
    }
}