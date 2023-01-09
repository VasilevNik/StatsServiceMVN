package ru.netology.stats;

public class StatsService {
    public int totalOfAllSales(int[] sales) {

        int sumSales = 0;
        for (int i = 0; i < sales.length; i++) {
            sumSales = sumSales + sales[i];
        }
        return sumSales;
    }

    public int averageOfAllSales(int[] sales) {

        return totalOfAllSales(sales) / 12;
    }

    public int peakSales(int[] sales) {

        int sumSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[sumSales]) {
                sumSales = i;
            }
        }
        return sumSales;
    }

    public int minimumSales(int[] sales) {

        int sumSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[sumSales]) {
                sumSales = i;
            }
        }
        return sumSales;
    }

    public int numberOfMonthsIsBelowAverage(int[] sales) {

        int numberOfMonths = 0;
        int averageSales = totalOfAllSales(sales) / 12;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSales) {
                numberOfMonths++;
            }
        }
        return numberOfMonths;
    }

    public int numberOfMonthsIsAboveAverage(int[] sales) {

        int numberOfMonths = 0;
        int averageSales = totalOfAllSales(sales) / 12;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales) {
                numberOfMonths++;
            }
        }
        return numberOfMonths;
    }
}
