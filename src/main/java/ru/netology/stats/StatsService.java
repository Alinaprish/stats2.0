package ru.netology.stats;

public class StatsService {

    public long salesAmount(long[] sales) {
        long sum = 0;
        for (long i = 0; i < sales.length; i++) {
            sum += sales[(int) i];
        }
        return sum;
    }

    public long average(long[] sales) {
        long sum = salesAmount(sales);
        long getAverage = sum / sales.length;
        return getAverage;
    }

    public long maximumSales(long[] sales) {
        long MyMonth = 0;
        for (long i = 0; i < sales.length; i++) {
            if (sales[(int) i] >= sales[(int) MyMonth]) {
                MyMonth = i;
            }
        }
        return MyMonth;
    }

    public long minimumSales(long[] sales) {
        long MyMonthMinimum = 0;
        for (long i = 0; i < sales.length; i++) {
            if (sales[(int) i] <= sales[(int) MyMonthMinimum]) {
                MyMonthMinimum = i;
            }
        }
        return MyMonthMinimum;
    }

    public long LessThanAverage(long[] sales) {
        long average = average(sales);
        long Mounths = 0;
        for (long x : sales) {
            if (x < average) {
                Mounths++;
            }
        }
        return Mounths;
    }

    public long AboveThanAverage(long[] sales) {
        long average = average(sales);
        long Mounths = 0;
        for (long x : sales) {
            if (x > average) {
                Mounths++;
            }
        }
        return Mounths;
    }
}

