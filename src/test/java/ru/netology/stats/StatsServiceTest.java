package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    @Test
    public void testSumSale() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.sum(sales);
        long expected = 180;

        Assertions.assertEquals(expected, actual);
        System.out.println(expected + " Ожидаемое значение суммы");
        System.out.println(actual + " Фактическое значение суммы");

    }

    @Test
    public void testAverageSale() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.average(sales);
        long expected = 15;

        Assertions.assertEquals(expected, actual);
        System.out.println(expected + " Ожидаемое значение средних продаж");
        System.out.println(actual + " Фактическое значение средних продаж");
    }

    @Test
    public void testMaxMonthSale() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int actual = service.maxMonthSale(sales);
        int expected = 8;

        Assertions.assertEquals(expected, actual);
        System.out.println(expected + " Ожидаемый месяц максимальных продаж");
        System.out.println(actual + " Фактическое месяц максимальных продаж");
    }

    @Test
    public void testMinMonthSale() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int actual = service.minMonthSale(sales);
        int expected = 9;

        Assertions.assertEquals(expected, actual);
        System.out.println(expected + " Ожидаемый месяц максимальных продаж");
        System.out.println(actual + " Фактическое месяц максимальных продаж");
    }

    @Test
    public void testMonthsBelowAverage() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int actual = service.monthsBelowAverage(sales);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
        System.out.println(expected + " Ожидаемое количество месяцев с продажами ниже среднего");
        System.out.println(actual + " Фактическое количество месяцев с продажами ниже среднего");
    }

    @Test
    public void testMonthsAboveAverage() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int actual = service.monthsAboveAverage(sales);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
        System.out.println(expected + " Ожидаемое количество месяцев с продажами выше среднего");
        System.out.println(actual + " Фактическое количество месяцев с продажами выше среднего");
    }
}