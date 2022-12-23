import java.util.Arrays;

public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long trimmedMean() {
        long[] sortedSales = sales.clone();
        Arrays.sort(sortedSales);

        long[] trimmedSortedSales = new long[sortedSales.length - 2];
        for (int i = 0; i < sortedSales.length - 2; i++) {
            trimmedSortedSales[i] = sortedSales[i + 1];
        }

//        System.arraycopy(sortedSales, 1, trimmedSortedSales, 0, sortedSales.length - 2);

        long sum = 0;
        for (long sale : trimmedSortedSales) {
            sum += sale;
        }

        return sum / trimmedSortedSales.length;
    }

    public long min() {
        long min = sales[0];
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }
}
