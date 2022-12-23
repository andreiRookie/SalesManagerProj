import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        SalesManager newManager;
        long[] weekSales = {2, 4, 7, 3, 5};
        newManager = new SalesManager(weekSales);

        System.out.println("newManager's week sales: " + Arrays.toString(newManager.sales));
        System.out.println("newManager's max sale is: " + newManager.max());
    }
}
