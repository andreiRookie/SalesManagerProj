import java.util.Arrays;

public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int trimmedMean() {
        int[] sortedSales = sales.clone();
        Arrays.sort(sortedSales);

        int[] trimmedSortedSales = new int[sortedSales.length - 2];
        for (int i = 0; i < sortedSales.length - 2; i++) {
            trimmedSortedSales[i] = sortedSales[i + 1];
        }

//        System.arraycopy(sortedSales, 1, trimmedSortedSales, 0, sortedSales.length - 2);

        int sum = 0;
        for (int sale : trimmedSortedSales) {
            sum += sale;
        }

        return sum / trimmedSortedSales.length;
    }

    public int min() {
        int min = sales[0];
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }
}
