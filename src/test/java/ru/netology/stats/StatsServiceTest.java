package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test

    public void totalOfAllSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSales = 180;
        int actualSales = service.totalOfAllSales(sales);

        Assertions.assertEquals(expectedSales, actualSales);

    }

    @Test
    public void averageOfAllSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverage = 15;
        int actualAverage = service.averageOfAllSales(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);

    }

    @Test
    public void peakSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedPeakSales = 7;
        int actualPeakSales = service.peakSales(sales);

        Assertions.assertEquals(expectedPeakSales, actualPeakSales);
    }

    @Test
    public void minimumSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinimumSales = 8;
        int actualMinimumSales = service.minimumSales(sales);

        Assertions.assertEquals(expectedMinimumSales, actualMinimumSales);
    }

    @Test
    public void numberOfMonthsIsBelowAverage() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedNumberOfMonths = 5;
        int actualNumberOfMonths = service.numberOfMonthsIsBelowAverage(sales);

        Assertions.assertEquals(expectedNumberOfMonths, actualNumberOfMonths);
    }

    @Test
    public void numberOfMonthsIsAboveAverage() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedNumberOfMonths = 5;
        int actualNumberOfMonths = service.numberOfMonthsIsAboveAverage(sales);

        Assertions.assertEquals(expectedNumberOfMonths, actualNumberOfMonths);
    }
}