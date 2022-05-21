package ru.netology;

public class StatsService {

    public int sum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;

        }
        return sum;
    }

    public int averSum(int[] sales) {
        return sum(sales) / sales.length;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; //
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int aboveAverS(int[] sales) {
        int averS = averSum(sales);
        int count = 0;
        for (int sale : sales) {

            if (sale > averS) {
                count++;
            }
        }
        return count;
    }

    public int smallerAverS(int[] sales) {
        int averS = averSum(sales);
        int count = 0;
        for (int sale : sales) {

            if (sale < averS) {
                count++;
            }
        }
        return count;

    }
}





